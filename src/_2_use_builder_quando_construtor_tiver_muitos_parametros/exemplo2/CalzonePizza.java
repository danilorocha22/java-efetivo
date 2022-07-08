package src._2_use_builder_quando_construtor_tiver_muitos_parametros.exemplo2;

import java.util.Objects;

// Sub-classe concreta
public class CalzonePizza extends Pizza  {
    private final boolean sauceInside;

    // Builder da sub-classe extendendo o Builder da Super Classe - classe interna
    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false; // Valor padrão

        public Builder saudeInside() {
            sauceInside = true;
            return this;
        }

        @Override
        public CalzonePizza build() {
            return new CalzonePizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }// Builder

    private CalzonePizza(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    @Override
    public String toString() {
        return "CalzonePizza{" +
                "sauceInside=" + sauceInside +
                ", toppings=" + toppings +
                '}';
    }
}
