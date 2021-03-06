package typeinfo.pets;

import java.util.*;

/**
 * Created by wwh on 16-3-21.
 */
public abstract class PetCreator {
    private Random rand = new Random(47);
    public abstract List<Class<? extends Pet>> types();
    public Pet randomPet() {
        int n = rand.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public Pet[] createArray(int size) {
        Pet[] result = new Pet[size];
        for(int i = 0; i < size; ++i) {
            result[i] = randomPet();
        }
        return result;
    }
    public ArrayList<Pet> arrayList(int size) {
        ArrayList<Pet> result = new ArrayList<Pet>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}
