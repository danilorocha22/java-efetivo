package src._15_priorize_as_classes_tipos_genericos;

import java.util.Arrays;
import java.util.EmptyStackException;

// Coleção baseada em Objeto - uma candidata excelente para usar genericos
/**
 * Essa classe deveria ter sido parametrizada desde o início, porém, como não
 * foi, podemos genereficá-la agora. Em outras palavras, podemos
 * parametrizá-la sem danificar os clientes da versão original não
 * parametrizada.
 */
public class Exemplo1 {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Exemplo1() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object o) {
        ensureCapacity();
        elements[size++] = o;
    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;//Elimine as referencias obsoletas.
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if  (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

}
