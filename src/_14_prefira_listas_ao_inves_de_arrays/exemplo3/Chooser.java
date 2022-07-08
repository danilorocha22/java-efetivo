package src._14_prefira_listas_ao_inves_de_arrays.exemplo3;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// Uma classe que precisa urgentemente ser transformada em genérico
public class Chooser {
    private final Object[] choiceArray;

    public Chooser(Collection choices) {
        this.choiceArray = choices.toArray();
    }

    public Object choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceArray[rnd.nextInt(choiceArray.length)];
    }

}
