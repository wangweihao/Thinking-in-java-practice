package typeinfo;

import typeinfo.pets.Pet;
import typeinfo.pets.PetCreator;

import java.util.*;
import java.util.Collections;
import java.util.List;

/**
 * Created by wwh on 16-3-21.
 */
public class LiteralPetCreator extends PetCreator {
    @SuppressWarnings("unckecked")

    public List<Class<? extends Pet>> types() {
        return null;
    }
}
