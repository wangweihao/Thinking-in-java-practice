package typeinfo.pets;

/**
 * Created by wwh on 16-3-21.
 */
public class Individual {
    public Individual(){
        name = "Individual";
    }
    public Individual(String _name) {
        name = _name;
    }
    public String id() {
        return name;
    }
    public String toString() {
        return name;
    }
    public String name;
}


