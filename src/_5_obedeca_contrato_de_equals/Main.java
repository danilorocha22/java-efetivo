package src._5_obedeca_contrato_de_equals;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Telefone, String> m = new HashMap<>();
        m.put(new Telefone((short) 55, (short) 63, (short) 1111), "Danilo");
        String proprietário = m.get(new Telefone((short) 55, (short) 63, (short) 1111));

        System.out.println("Proprietário: "+ proprietário);

        System.out.println("Telefone: "+new Telefone((short) 55, (short) 63, (short) 111));
    }
}
