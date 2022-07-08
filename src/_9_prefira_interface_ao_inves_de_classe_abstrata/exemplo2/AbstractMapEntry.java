package src._9_prefira_interface_ao_inves_de_classe_abstrata.exemplo2;

import java.util.Map;
import java.util.Objects;

// Classe de implementação skeletal
public abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V> {

    // Entradas em um map alterável devem sobrescrever esse método
    @Override
    public V setValue(V value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Map.Entry))
            return false;
        Map.Entry<?,?> e = (Map.Entry) obj;
        return Objects.equals(e.getKey(), getKey()) && Objects.equals(e.getValue(), getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getKey()) ^ Objects.hashCode(getValue());
    }

    @Override
    public String toString() {
        return getKey() +"="+ getValue();
    }
}
