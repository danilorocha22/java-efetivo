package src._1_use_metodos_fabricas_no_lugar_de_construtores;

/**
 * VANTAGENS
 * Uma das vantagens dos métodos static factory é que, ao contrário dos
 * construtores, eles têm nomes.
 * A segunda vantagem dos métodos static factory é que, ao contrário
 * dos construtores, não precisam criar um novo objeto sempre que
 * invocados.
 * A terceira vantagem dos métodos static factory é que, ao contrário
 * dos construtores, podem retornar um objeto de qualquer subtipo do
 * próprio tipo de retorno. Isso lhe dá uma grande flexibilidade na escolha
 * da classe do objeto retornado.
 * A quarta vantagem das static factories é que a classe do objeto
 * retornado pode variar de chamada para chamada, em função dos
 * parâmetros de entrada.
 * A quinta vantagem das static factories é que não precisa existir a
 * classe do objeto retornado quando a classe contém o método de escrita.
 *
 * DESVANTAGENS
 * A principal limitação de fornecer apenas métodos static factory é que
 * as classes sem construtores públicos ou protegidos não podem ser
 * divididas em subclasses.
 * A segunda limitação dos métodos static factory é que são difíceis de
 * ser encontrados pelos programadores. Eles não estão destacados na
 * documentação da API do mesmo modo que os construtores,
 *
 */

public class Exemplo1 {
    public static void main(String[] args) {

        System.out.println(valueOf(true));

    }

    /**
     * Exemplo de factory method (método fábrica)
     * @param b
     * @return true ou false
     */
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

}
