package src._13_em_generics_elemite_as_advertencias_nao_verificadas.exemplo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    /**
     * Você pode se sentir tentado a inseri-la em todo o método, porém, não faça isso. Em vez disso,
     * declare uma variável local para segurar o valor de retorno e anotar essa
     * declaração, deste modo:
     */
   /* public static <T> T[] toArray(T[] a) {
      int[] elements = {1, 2, 3, 4, 5};
        int size = elements.length;
        if (a.length < size) {
            // Este cast está certo pq é o array que estamos criando
            // Este é o mesmo tipo que o tipo passado, que é T[]
            @SuppressWarnings("unchecked")
            T[] result = (T[]) Arrays.copyOf(elements, size, a.getClass());
            return result;
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }*/
}
