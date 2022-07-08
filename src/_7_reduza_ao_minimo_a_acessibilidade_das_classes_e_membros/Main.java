package src._7_reduza_ao_minimo_a_acessibilidade_das_classes_e_membros;

public class Main {

    public static void main(String[] args) {
        //Forma errada, há falha de segurança, pois os valores de VALUES podem ser alterados
        /*int tam = Exemplo1.VALUES.length;

        System.out.println("Array original:");
        Arrays.stream(Exemplo1.VALUES).forEach(System.out::println);

        for (int i = 0; i < tam ; i++)
            Exemplo1.VALUES[i] = Exemplo1.VALUES[i] * 3;

        System.out.println("\nArray modificado: ");
        Arrays.stream(Exemplo1.VALUES).forEach(System.out::println);*/


        //1ª forma correta
        //Lança uma exception ao tentar alterar os valores de VALUES
        int tam = Exemplo1.VALUES.size();

        System.out.println("Array original:");
        Exemplo1.VALUES.forEach(System.out::println);

        try {
            for (int i = 0; i < tam; i++)
                Exemplo1.VALUES.add(i, i * 3);
        } catch (UnsupportedOperationException ex) {
            System.out.println("Não é permitido alterar os valores da constante: VALUES");
        }

        System.out.println("\nArray modificado ou não:");
        Exemplo1.VALUES.forEach(System.out::println);

        //2ª forma correta
        //Lança uma exception ao tentar remover os valores de VALUES
        /*int tam = Exemplo1.values().length;

        System.out.println("Array original:");
        Arrays.stream(Exemplo1.values()).iterator().forEachRemaining(System.out::println);

        for (int i = 0; i < tam; i++) {
            Arrays.stream(Exemplo1.values()).iterator().remove();
        }

        System.out.println("\nArray modificado:");
        Arrays.stream(Exemplo1.values()).iterator().forEachRemaining(System.out::println);*/

    }
}
