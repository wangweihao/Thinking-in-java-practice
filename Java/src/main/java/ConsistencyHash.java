import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * Created by wwh on 16-5-1.
 */
public class ConsistencyHash {
    private TreeMap<Long, Object> nodes = null;
    private ArrayList<Object> shards = new ArrayList<Object>();

    private int VIRTUAL_NUM = 4;

    public void init() {
        shards.add("192.168.0.0-服务器0");
        shards.add("192.168.0.1-服务器1");
        shards.add("192.168.0.2-服务器2");
        shards.add("192.168.0.3-服务器3");
        shards.add("192.168.0.4-服务器4");

        nodes = new TreeMap<Long, Object>();
        for (int i = 0; i < shards.size(); ++i) {
            Object shardInfo = shards.get(i);
            for (int j = 0; j < VIRTUAL_NUM; ++j) {
                /* 将每台机器 Hash 到环上 */
                nodes.put(hash(computeMd5("SHARD-" + i + "-NODE-" + j), j), shardInfo);
            }
        }
    }

    public Object getShardInfo(long hash) {
        Long key = hash;
        SortedMap<Long, Object> tailMap = nodes.tailMap(key);
        if (tailMap.isEmpty()) {
            key = nodes.firstKey();
        }else {
            key = tailMap.firstKey();
        }
        return nodes.get(key);
    }

    public void printMap() {
        System.out.println(nodes);
    }

    public byte[] computeMd5(String k) {
        MessageDigest md5;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 not supported", e);
        }
        md5.reset();
        byte[] keyBytes = null;
        try {
            keyBytes = k.getBytes("UTF-8");
        }catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Unknown string :" + k, e);
        }

        md5.update(keyBytes);
        return md5.digest();
    }

    public long hash(byte[] digest, int nTime) {
        long rv = ((long) (digest[3+nTime*4] & 0xFF) << 24)
                | ((long) (digest[2+nTime*4] & 0xFF) << 16)
                | ((long) (digest[1+nTime*4] & 0xFF) << 8)
                | (digest[0+nTime*4] & 0xFF);

        return rv & 0xffffffffL;
    }

    public static void main(String[] args) {
        Random ran = new Random();
        ConsistencyHash hash = new ConsistencyHash();
        hash.init();
        hash.printMap();
        for (int i = 0; i < 50; ++i) {
            System.out.println(hash.getShardInfo(hash.hash(hash.computeMd5(String.valueOf(i)), ran.nextInt(hash.VIRTUAL_NUM))));
        }
    }
}
