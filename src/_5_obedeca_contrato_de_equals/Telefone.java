package src._5_obedeca_contrato_de_equals;

import java.util.Objects;

// Classe usando um típico método equals()
/**
 * O método equals implementa uma relação de equivalência, que tem as
 * seguintes propriedades:
 * Reflexivo: Para qualquer valor de referência não nulo x,
 * x.equals(x) deve retornar true.
 * Simétrica: Para quaisquer valores de referência não nulos x e y,
 * x.equals(y) deve retornar true, se, e somente se, y.equals(x)
 * retornar true .
 * Transitiva: Para quaisquer valores de referência não nulos x, y, z,
 * se x.equals(y) retornar true e y.equals(z) também retornar
 * true , assim, x.equals(z) , deve retornar true .
 * Consistente: Para quaisquer valores de referência não nulos x e y,
 * inúmeras invocações de x.equals(y) devem retornar
 * consistentemente true ou retornar consistentemente false, desde
 * que nenhuma informação usada nas comparações do equals seja
 * modificada.
 * Não nulidade: para qualquer valor de referência não nulo x, x.equals(null)
 * deve retornar false.
 *
 * Em síntese, não sobrescreva o método equals, a
 * menos que precise: em muitos casos, a implementação
 * herdada da Object faz exatamente o que quer. Se
 * tiver que sobrescrever os equals, faça questão de
 * comparar todos os campos significativos da classe e
 * também de os comparar de modo a preservar todas as
 * cinco regras do contrato do equals.
 */
public final class Telefone {
    private final short codArea, prefixo, numero;

    public Telefone(short codArea, short prefixo, short numero) {
        this.codArea = checkRange(codArea, 999, "Cód. Área");
        this.prefixo = checkRange(prefixo, 999, "Prefixo");
        this.numero = checkRange(numero, 9999, "Número");
    }

    public short getCodArea() {
        return codArea;
    }

    public short getPrefixo() {
        return prefixo;
    }

    public short getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return String.format("%03d-%03d-%04d", codArea, prefixo, numero);
    }

    /*@Override
    public String toString() {
        return "Telefone{}";
    }*/

    private static short checkRange(int val, int max, String arg) {
        if  (val < 0 || val > max)
            throw new IllegalArgumentException(arg +": "+ val);
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //verifica se o argumento é uma referência ao objeto
        if (!(o instanceof Telefone)) return false; //verifica se o argumento apresenta o tipo correto
        Telefone telefone = (Telefone) o; //Faz o cast do argumento para o tipo correto
        return codArea == telefone.codArea && prefixo == telefone.prefixo && numero == telefone.numero; //Para cada
        // campo “significativo” na classe, verifica se o campo do argumento coincide com o correspondente do objeto
    }

    @Override
    public int hashCode() {
        //return 42;
        return Objects.hash(codArea, prefixo, numero);
    }

}
