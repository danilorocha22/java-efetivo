package src._8_reduza_ao_minimo_a_mutabilidade_das_classes.exemplo1;

import java.math.BigInteger;
import java.util.Objects;

//Exemplo 1 de classe imutável - final class
public final class ComplexNumber {
    //campos imutáveis
    private final double re;
    private final double im;

    //Constantes comumente usadas pelas classes clientes
    public static final ComplexNumber ZERO = new ComplexNumber(0,0);
    public static final ComplexNumber ONE = new ComplexNumber(1, 0);
    public static final ComplexNumber I = new ComplexNumber(0, 1);

    //Construtor público
    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    //Somente os getters são implementados - setters omitidos
    public double realPart() {
        return re;
    }

    public double imaginaryPart() {
        return im;
    }

    //Outros métodos
    /*
    Observe como as operações aritméticas criam e retornam uma nova instância
    ComplexNumber ao invés de modificá-la.
     */
    public ComplexNumber plus(ComplexNumber c) {
        return new ComplexNumber(re + c.re, im + c.im);
    }

    public ComplexNumber minus(ComplexNumber c) {
        return new ComplexNumber(re - c.re, im - c.im);
    }

    public ComplexNumber times(ComplexNumber c) {
        BigInteger bigInteger = new BigInteger("1");

        return new ComplexNumber(re * c.re - im * c.im,
                                 re * c.im + im * c.re);
    }

    public ComplexNumber divideBy(ComplexNumber c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new ComplexNumber((re * c.re + im * c.im) / tmp,
                                 (im * c.re - re * c.im) / tmp);
    }

    //Equals e HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComplexNumber)) return false;
        ComplexNumber c = (ComplexNumber) o;
        return Double.compare(c.re, re) == 0 && Double.compare(c.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }

    //ToString
    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}
