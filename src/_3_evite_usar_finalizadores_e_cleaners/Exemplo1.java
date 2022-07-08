package src._3_evite_usar_finalizadores_e_cleaners;

/**
 * O cleaner da clase Room é usado apenas como uma rede de segurança.
 * Se os clientes circundam todas as instanciações da Room em
 * blocos try -with-resources, nunca será necessária uma limpeza
 * automática. Veja como esse cliente bem-comportado se apresenta:
 */
public class Exemplo1 {
    public static void main(String[] args) {

        try (Room room = new Room(7)) {
            System.out.println("Adeus...");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
