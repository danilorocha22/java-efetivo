package src._8_reduza_ao_minimo_a_mutabilidade_das_classes.exemplo2;

public class Main2 {

    public static void main(String[] args) {
        ComplexNumber2 c1 = ComplexNumber2.valueOf(2, 4);
        ComplexNumber2 c2 = ComplexNumber2.valueOf(4, 8);
        ComplexNumber2 c3 = ComplexNumber2.valueOf(2, 4);

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
