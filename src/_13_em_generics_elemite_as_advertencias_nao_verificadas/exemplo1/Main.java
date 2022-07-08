package src._13_em_generics_elemite_as_advertencias_nao_verificadas.exemplo1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Gera advertência
        Set<Lark> exaltation = new HashSet();

        // Nâo gera advertência
        Set<Lark> exaltation2 = new HashSet<>();


        System.out.println(exaltation);
        System.out.println(exaltation2);
    }
}
