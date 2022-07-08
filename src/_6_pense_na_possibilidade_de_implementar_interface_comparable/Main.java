package src._6_pense_na_possibilidade_de_implementar_interface_comparable;

public class Main {
    public static void main(String[] args) {
        Telefone tel1 = new Telefone((short) 55, (short) 63, (short) 9999);
        Telefone tel2 = new Telefone((short) 55, (short) 63, (short) 9999);

        System.out.println(tel1.compareTo(tel2));
        System.out.println(tel1.equals(tel2));
    }
}
