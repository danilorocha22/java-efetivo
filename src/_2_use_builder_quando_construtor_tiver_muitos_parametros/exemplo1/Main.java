package src._2_use_builder_quando_construtor_tiver_muitos_parametros.exemplo1;

/**
 * PADRÃO BUILDER
 * <p>
 * VANTAGENS
 * As static factories e os construtores compartilham uma limitação: não se
 * adéquam bem a um grande número de parâmetros opcionais.
 * O padrão Builder simula os parâmetros opcionais nomeados como os que
 * encontramos nas linguagens Python e Scala.
 * O padrão Builder se adéqua bem às hierarquias de classe. Use uma
 * hierarquia paralela de builders, cada qual aninhado à classe correspondente.
 * As classes abstratas têm builders abstratos; as classes concretas, builders
 * concretos.
 *
 * DESVANTAGENS
 * O padrão Builder também apresenta desvantagens. Para criar um objeto,
 * você deve primeiro criar um builder. Embora seja pouco provável que o
 * custo de criação desse builder seja considerável na prática, isso pode ser um
 * problema em situações críticas de desempenho.
 * Além disso, o padrão Builder é mais verboso do que o padrão do
 * telescoping constructor, logo, ele deve ser usado apenas se houver
 * parâmetros suficientes que justifiquem seu uso, digamos que quatro
 * parâmetros ou mais.
 */
public class Main {

    public static void main(String[] args) {

        Builder builder = new Builder(4, 2);
        builder.calories(200);
        builder.sodium(50);

        NutritionFacts nutritionFacts = new NutritionFacts(builder);

        System.out.println(nutritionFacts);

    }
}
