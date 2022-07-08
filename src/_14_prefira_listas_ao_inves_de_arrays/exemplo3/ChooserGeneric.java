package src._14_prefira_listas_ao_inves_de_arrays.exemplo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// Transformando em genérico
public class ChooserGeneric<T> {
    private final List<T> choiceList;

    public ChooserGeneric(Collection<T> choices) {
        this.choiceList = new ArrayList<>(choices);
    }

    public Object choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }

}
