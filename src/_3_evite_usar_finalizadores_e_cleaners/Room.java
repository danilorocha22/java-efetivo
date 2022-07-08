package src._3_evite_usar_finalizadores_e_cleaners;

import java.lang.ref.Cleaner;

// Classe AutoCloseable usando um cleaner como rede de segurança
public class Room implements AutoCloseable {

    private static final Cleaner CLEANER = Cleaner.create();

    // Recursos que exigem limpeza. Não podemos referenciar a classe Room, por isso use static!
    private static class State implements Runnable {
        int numJunkPiles; //Quantidade de pilhas de lixo na Room

        State(int numJunkPiles) {
            this.numJunkPiles = numJunkPiles;
        }

        //Run invocado pelo método close() ou pelo cleaner
        @Override
        public void run() {
            System.out.println("Limpando a sala");
            numJunkPiles = 0;
        }
    }//State

    //O estado de Room, compartilhado com nosso estado
    private final State state;

    //Nossa cleanable. Limpa a sala quando ela é elegível
    private final Cleaner.Cleanable cleanable;

    public Room(int numJunkPiles) {
        state = new State(numJunkPiles);
        cleanable = CLEANER.register(this, state);
    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
    }

}
