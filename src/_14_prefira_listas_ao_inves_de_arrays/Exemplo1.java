package src._14_prefira_listas_ao_inves_de_arrays;

/**
 *  Você pode pensar que isso
 * significa que os genéricos são defeituosos, porém, indiscutivelmente, são os
 * arrays que são defeituosos
 */
public class Exemplo1 {

    //Falha no momento da execução
    public static void main(String[] args) {
        Object[] objects = new Long[1];
        objects[0] = "Eu não entro"; //Lança uma exception: ArrayStoreException

        System.out.println(objects[0]);
    }
}
