package typeinfo;

/**
 * Created by wwh on 16-3-21.
 */
public class WildcardClassReferences {
    public static void main(String []args){
        Class<?> intclass = int.class;
        intclass = double.class;
    }
}
