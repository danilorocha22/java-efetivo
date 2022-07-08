package src._15_priorize_as_classes_tipos_genericos;

public class Main {

    // Testar o exemplo2
    public static void main(String[] args) {
        Exemplo2<String> pilha = new Exemplo2<>();

        for (String arg: args)
            pilha.push(arg);

        while (!pilha.isEmpty())
            System.out.println(pilha.pop().toUpperCase());

    }
}
