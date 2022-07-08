package src._9_prefira_interface_ao_inves_de_classe_abstrata.exemplo1;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

/**
 * Implementação concreta construída em cima da implementação skeletal
 */
public class ImplList {
    static List<Integer> intArrayAsList(int[] a) {
        Objects.requireNonNull(a);
        return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return a[index]; //autoboxing
            }

            @Override
            public Integer set(int index, Integer element) {
                int oldEle = a[index];
                a[index] = element; //autoboxing
                return oldEle; //autoboxing
            }

            @Override
            public int size() {
                return a.length;
            }
        };
    }
}
