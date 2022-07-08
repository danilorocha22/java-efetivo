package src._4_use_try_with_resources_ao_inves_de_try_finally.exemplo1;

import java.io.*;

/**
 * Try-finally não é mais a melhor forma de fechar os recursos
 */
public class TryFinally {

    private Object object;

    private static final int BUFFER_SIZE = 100;

    static String firstLineOfFila(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }

    //Aparentemente o metodo acima não é ruim, porém fica bem pior quando você
    //adiciona um segundo recurso:
    static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src); //primeiro recurso
        try {
            OutputStream out = new FileOutputStream(dst); //segundo recurso
            try {
                byte[] buf = new byte[BUFFER_SIZE];
                int n;
                while ((n = in.read(buf)) >= 0)
                    out.write(buf, 0, n);
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }

}
