package src._2_use_builder_quando_construtor_tiver_muitos_parametros.exemplo2;

import static src._2_use_builder_quando_construtor_tiver_muitos_parametros.exemplo2.NYPizza.Size.SMALL;
import static src._2_use_builder_quando_construtor_tiver_muitos_parametros.exemplo2.Pizza.Topping.*;

/**
 * Uma pequena vantagem dos builders em relação aos construtores é que os
 * builders podem apresentar diversos parâmetros de varargs, pois, cada
 * parâmetro é especificado no próprio método.
 * Por outro lado, os builders podem agregar os parâmetros passados
 * em múltiplas chamadas de um método dentro de um único campo,
 * conforme demonstrado anteriormente no método addTopping.
 */
public class Main {

    public static void main(String[] args) {

        NYPizza nyPizza = new NYPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();

        CalzonePizza calzonePizza = new CalzonePizza.Builder()
                .addTopping(HAM).saudeInside().build();

        System.out.println(nyPizza);
        System.out.println(calzonePizza);
    }

}
