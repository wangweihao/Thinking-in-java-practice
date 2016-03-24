package containers;


import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Created by wwh on 16-3-24.
 */

interface Generator<T> {
    T next();
}

class Government implements Generator<String> {
    String[] foundation = ("strange women lyuing in ponds" + "distributing swords is no ba" +
            "sis").split(" ");
    private int index;
    public String next() {
        return foundation[index++];
    }
}

public class CollectionDataTest {
    public static void main(String[] args) {}
}
