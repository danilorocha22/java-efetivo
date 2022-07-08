package src._14_prefira_listas_ao_inves_de_arrays;

/**
 * Você não pode inserir uma String em um contêiner Long,
 * mas, com um array, descobre que cometeu um erro em tempo de execução;
 * já com uma lista, você descobre em tempo de compilação. Obviamente,
 * você prefere descobrir em tempo de compilação.
 */
public class Exemplo2 {

    // Não compilará
    public static void main(String[] args) {
        /*List<Object> ol = new ArrayList<Long>(); //Tipos incompatíveis
        ol.add("Eu não entro");*/
    }
}
