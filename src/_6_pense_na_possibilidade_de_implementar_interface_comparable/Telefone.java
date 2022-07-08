package src._6_pense_na_possibilidade_de_implementar_interface_comparable;

import java.util.Comparator;
import java.util.Objects;

// Classe usando um típico método compareTo()
public final class Telefone implements Comparable<Telefone> {
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

    private static short checkRange(int val, int max, String arg) {
        if (val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }

    //Múltiplos campos da Comparable com campos primitivos
   /* @Override
    public int compareTo(Telefone tel) {
        int res = Short.compare(codArea, tel.codArea);
        if (res == 0) {
            res = Short.compare(prefixo, tel.prefixo);
            if (res == 0) {
                res = Short.compare(numero, tel.numero);
            }
        }
        return res;
    }*/

    //Comparable com métodos de construção de Comparator
    /**
     * Essa implementação cria um comparador no
     * momento da inicialização da classe, usando dois
     * métodos de construção do comparador. O primeiro é o
     * comparingInt. Ele é um método estático que aceita uma
     * Função extratora de chave que mapeia uma referência
     * de objeto para uma chave de tipo int e retorna um
     * comparador que ordena as instâncias de acordo com
     * essa chave. No exemplo anterior, o comparingInt tem
     * um lambda () que extrai o código de área de um
     * PhoneNumber e retorna um Comparator<Telefone>, que
     * sistematiza os números de telefone conforme os seus códigos
     * de área. Observe que o lambda especifica categoricamente
     * o tipo do seu parâmetro de entrada (Telefone tel).
     * No final das contas, nessa situação, a inferência
     * de tipo do Java não é poderosa o bastante para descobrir
     * o tipo por si própria, por esse motivo, somos obrigados a
     * ajudá-lo a compilar o programa.
     */
    private static final Comparator<Telefone> COMPARATOR = Comparator.comparingInt(
                    (Telefone tel) -> tel.codArea)
            .thenComparing(tel -> tel.prefixo)
            .thenComparing(tel -> tel.numero);

    @Override
    public int compareTo(Telefone tel) {
        return COMPARATOR.compare(this, tel);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Telefone)) return false;
        Telefone telefone = (Telefone) o;
        return getCodArea() == telefone.getCodArea() && getPrefixo() == telefone.getPrefixo() && getNumero() == telefone.getNumero();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodArea(), getPrefixo(), getNumero());
    }
}
