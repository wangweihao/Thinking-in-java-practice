package typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wwh on 16-3-21.
 * 使用 forName 创建 Class 对象 List
 */
public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();
    private static String[] typeNames = {
            "typeinfo.pets.Mutt",
            "typeinfo.pets.Pug",
            "typeinfo.pets.EgyptianMau",
            "typeinfo.pets.Manx",
            "typeinfo.pets.Cymric",
            "typeinfo.pets.Rat",
            "typeinfo.pets.Mouse",
            "typeinfo.pets.Hamster",
    };
    @SuppressWarnings("unchecked")
    private static void loader(){
        try{
            for(String name : typeNames)
                types.add((Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    static {loader();}
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
