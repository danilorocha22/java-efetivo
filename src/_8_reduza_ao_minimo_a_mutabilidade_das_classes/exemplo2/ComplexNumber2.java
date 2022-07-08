package src._8_reduza_ao_minimo_a_mutabilidade_das_classes.exemplo2;

import java.math.BigInteger;
import java.util.*;

//Exemplo 2 de classe imutável - construtor privado e método fábrica stático
public class ComplexNumber2 {
    //campos imutáveis
    private final double re;
    private final double im;

    //Constantes comumente usadas pelas classes clientes
    public static final ComplexNumber2 ZERO = new ComplexNumber2(0,0);
    public static final ComplexNumber2 ONE = new ComplexNumber2(1, 0);
    public static final ComplexNumber2 I = new ComplexNumber2(0, 1);

    //Construtor privado
    private ComplexNumber2(double re, double im) {
        this.re = re;
        this.im = im;
    }

    //Método stático fábrica
    public static ComplexNumber2 valueOf(double re, double im) {
        return new ComplexNumber2(re, im);
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
    public ComplexNumber2 plus(ComplexNumber2 c) {
        return new ComplexNumber2(re + c.re, im + c.im);
    }

    public ComplexNumber2 minus(ComplexNumber2 c) {
        return new ComplexNumber2(re - c.re, im - c.im);
    }

    public ComplexNumber2 times(ComplexNumber2 c) {
        BigInteger bigInteger = new BigInteger("1");

        return new ComplexNumber2(re * c.re - im * c.im,
                                 re * c.im + im * c.re);
    }

    public ComplexNumber2 divideBy(ComplexNumber2 c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new ComplexNumber2((re * c.re + im * c.im) / tmp,
                                 (im * c.re - re * c.im) / tmp);
    }

    //Verifica se uma instância é realmente de BigInteger
    public static BigInteger safeInstance(BigInteger val) {
        return val.getClass() == BigInteger.class ?
                val : new BigInteger(val.toByteArray());
    }

    //Equals e HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComplexNumber2)) return false;
        ComplexNumber2 c = (ComplexNumber2) o;
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
