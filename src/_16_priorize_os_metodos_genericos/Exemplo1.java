package src._16_priorize_os_metodos_genericos;

import java.util.HashSet;
import java.util.Set;

//Exemplo com uso errado e correto de método genérico
public class Exemplo1 {

    //Usa tipos brutos, o que é inaceitável
    public static Set uniao(Set s1, Set s2) {
        Set res = new HashSet(s1);
        res.addAll(s2);
        return res;
    }

    /**
     * Para corrigir essas advertências e fazer com que o método seja typesafe,
     * modifique a declaração do método para declarar um parâmetro de tipo que
     * represente o tipo de elemento para os três sets (os dois argumentos e o valor
     * de retorno), e use esse parâmetro de tipo em todo o método.
     */
    //Metodo genérico
    public static <E> Set<E> uniaoSafe(Set<E> s1, Set<E> s2) {
        Set<E> res = new HashSet<>(s1);
        res.addAll(s2);
        return res;
    }

}
