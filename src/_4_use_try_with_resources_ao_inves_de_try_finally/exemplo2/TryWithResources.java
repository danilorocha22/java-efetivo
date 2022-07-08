package src._4_use_try_with_resources_ao_inves_de_try_finally.exemplo2;

import java.io.*;

/**
 * Resolveram-se todos esses problemas de uma vez só quando o Java 7
 * introduziu a instrução try-with-resources [JLS, 14.20.3]. Para essa
 * construção ser aproveitada, um recurso deve implementar a interface
 * AutoCloseable , composta de um único método que retorna void , o
 * método close . Atualmente, muitas classes e interfaces nas bibliotecas Java
 * e em bibliotecas de terceiros implementam ou estendem a AutoCloseable .
 * Se você escrever uma classe que represente um recurso que deve ser
 * fechado, sua classe também deve implementar a AutoCloseable .
 *
 * As versões do try-with-resources não são apenas mais curtas e mais
 * legíveis que as originais, como também fornecem diagnósticos bem
 * melhores. Analise o método firstLineOfFile. Se lançarmos as exceções
 * tanto pela chamada readLine quanto pelo close (invisível), a segunda
 * exceção é suprimida em favor da primeira. Aliás, muitas exceções podem
 * ser suprimidas para preservar a exceção que você realmente quer ver. Essas
 * exceções suprimidas não são meramente descartadas; elas são exibidas no
 * rastreamento da pilha com uma notação dizendo que foram suprimidas.
 * Você também pode as acessar de modo programático com o método
 * getSuppressed, que foi incluído ao Throwable no Java 7.
 */
public class TryWithResources {

    private static final int BUFFER_SIZE = 100;
    private static final String DEFAULT_VALUE = "valor padrão";

    //Veja como nosso primeiro exemplo apresenta o uso do try-with-resources:
    static String firstLineOfFila(String path) {
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return DEFAULT_VALUE;
        }
    }

    //E, aqui, veja como ficou nosso segundo exemplo usando o try-with-resources:
    static void copy(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }

}
