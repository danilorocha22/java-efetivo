package src._2_use_builder_quando_construtor_tiver_muitos_parametros.exemplo2;

import java.util.Objects;

// Sub-classe concreta
public class NYPizza extends Pizza  {
    public enum Size { SMALL, MEDIUM, LARGE }
    private final Size size;

    // Builder da sub-classe extendendo o Builder da Super Classe - classe interna
    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size, "Size é obrigatório");
        }

        @Override
        public NYPizza build() {
            return new NYPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }// Builder

    NYPizza(Builder builder) {
        super(builder);
        size= builder.size;
    }

    @Override
    public String toString() {
        return "NYPizza{" +
                "size=" + size +
                ", toppings=" + toppings +
                '}';
    }
}
