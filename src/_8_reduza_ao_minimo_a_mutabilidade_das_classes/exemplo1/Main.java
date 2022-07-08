package src._8_reduza_ao_minimo_a_mutabilidade_das_classes.exemplo1;

import src._8_reduza_ao_minimo_a_mutabilidade_das_classes.exemplo1.ComplexNumber;

public class Main {

    public static void main(String[] args) {
        ComplexNumber c1 = new  ComplexNumber(2, 4);
        ComplexNumber c2 = new ComplexNumber(4, 8);
        ComplexNumber c3 = new ComplexNumber(2, 4);

        System.out.println("c1: "+ c1);
        System.out.println("c2: "+ c2);
        System.out.println();
        System.out.println("Resultado c1 + c2: "+ c1.plus(c2));
        System.out.println("Resultado c2 / c1: "+ c2.divideBy(c1));
        System.out.println("Resultado c2 - c1: "+ c2.minus(c1));
        System.out.println("Resultado c1 * c2: "+ c1.times(c2));
        System.out.println();
        System.out.println("c1 é igual a c3: "+ c1.equals(c3));
    }

}
