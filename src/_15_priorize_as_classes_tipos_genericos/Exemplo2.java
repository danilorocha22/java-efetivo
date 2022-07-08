package src._15_priorize_as_classes_tipos_genericos;

import java.util.Arrays;
import java.util.EmptyStackException;

// Transformação da classe em genérico
/**
 * Há duas formas de generificar esta classe a primeira é no
 * construtor e a segunda é dentro do método push.
 */
public class Exemplo2<E> {
    //private Object[] elements; //2ª forma
    private E[] elements; //1ª forma
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    /**
     * O array em questão (elements) é armazenado em um campo privado e nunca
     * retornado para o cliente ou passado para qualquer outro método. Os únicos
     * elementos armazenados no array são aqueles passados para o método push,
     * que são do tipo E; desse modo, o cast não verificado não pode causar danos.
     * Uma vez que você provou que o cast não verificado é seguro, suprima a
     * advertência em um escopo que seja o menor possível (Item 27). Nesse caso,
     * o construtor tem apenas a criação do array não verificado; assim,
     * recomenda-se que você suprima a advertência em todo o construtor.
     */
    @SuppressWarnings("unchecked")
    public Exemplo2() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY]; //1ª Forma
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0)
            throw new EmptyStackException();

        //O push exige elements do tipo E, então o cast está correto
        //@SuppressWarnings("unchecked")
        //E result = (E) elements[--size]; //2ª Forma

        E result = elements[--size];
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
