package src._12_em_generics_nao_use_tipo_brutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Consequentemente, você perde a type safety caso utilize um tipo bruto como o List, mas
 * não se usar um tipo parametrizado como o List<Object>
 */
public class exemplo1 {

    // Falha no momento da execução - o método unsafeAdd usa tipo bruto (List) - não use assim!
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(42));
        String s = strings.get(0); // Tem cast compilado
    }

    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

    // Uso de tipo bruto para um tipo de elemento desconhecido - não use assim!
    private static int numElementsInCommon(Set s1, Set s2) {
        int result = 0;
        for (Object o1: s1)
            if (s2.contains(o1))
                result++;
        return result;
    }

    // Uso legítimo do tipo bruto - operador instanceof
    private static Set getSet(Object o) {
        Set<?> s = null;
        if (o instanceof Set) // tipo bruto
            s = (Set<?>) o; // tipo curinga
        return s;
    }



    /**
     * A alternativa mais segura é utilizar os tipos wildcard ilimitados . Caso queira
     * usar um tipo genérico, mas não saiba ou não se importe com o formato do
     * parâmetro real, você pode empregar o sinal do ponto de interrogação para
     * substituí-lo. Por exemplo, o tipo wildcard ilimitado para o tipo genérico
     * Set<E> é Set<?> (leia-se “set de algum tipo ”)
     * @param s1 qualquer elemento do conjunto 1
     * @param s2 qualquer elemento do conjunto 2
     * @return resultado
     */
    private static int numElementsInCommonSafe(Set<?> s1, Set<?> s2) {
        int result = 0;
        for (Object o1 : s1)
            if (s2.contains(o1))
                result++;
        return result;
    }


}
