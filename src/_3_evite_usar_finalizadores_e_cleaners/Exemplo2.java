package src._3_evite_usar_finalizadores_e_cleaners;

/**
 * Mas e quanto a esse programa malcomportado, que nunca limpa seu cômodo?
 * Você pode esperar que ele exiba um Para fora, seguido de Limpando a
 * sala, mas, na minha máquina, ele nunca exibe o Limpando a sala, ele
 * apenas encerra. Essa é a imprevisibilidade da qual falamos anteriormente.
 */
public class Exemplo2 {
    public static void main(String[] args) {

        new Room(99);
        System.out.println("Para fora");

        /**
         * Na minha máquina, adicionar a linha System.gc() ao método main é o
         * suficiente para exibir o Limpando a sala antes da saída, mas não há garantia
         * de que você verá o mesmo comportamento em sua máquina.
         */
        //System.gc();

    }
}
