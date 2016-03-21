package typeinfo;

/**
 * Created by wwh on 16-3-21.
 */

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args)
            throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        /*Candy c = new Candy();
        try{
            Class.forName("typeinfo.Gum");
        }catch (ClassNotFoundException e) {
            System.out.println("Not found Gum");
        }
        new Cookie();
        new Candy();

        Class GumClass = Class.forName("typeinfo.Gum");*/
        Class c = Class.forName(args[1] + "." +args[2]);
        Gum g = (Gum) c.newInstance();
    }
}
