package src._7_reduza_ao_minimo_a_acessibilidade_das_classes_e_membros;

import java.util.List;

//Classe pacote-privado ou default
class Exemplo1 {

    //Falha de segurança, o array pode ser alterado pq está público
    //public static final Integer[] VALUES = { 1, 2, 3, 4, 5};

    //Forma correta, campo private
    private static final Integer[] PRIVATE_VALUES = { 1, 2, 3, 4, 5 };

    //Há duas formas de dá acesso sem ocorrer falha de segurança:
    //1ª forma
    public static final List<Integer> VALUES = List.of(PRIVATE_VALUES);

    //2ª forma
    /*public static final Integer[] values() {
        return PRIVATE_VALUES.clone();
    }*/


}
