package src._2_use_builder_quando_construtor_tiver_muitos_parametros.exemplo2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

// Padrão Builder para hierarquia de classe
public abstract class Pizza {
    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
    final Set<Topping> toppings;

    // Builder - classe interna
    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        protected abstract T self();

        abstract Pizza build();
    }// Builder

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }


}
