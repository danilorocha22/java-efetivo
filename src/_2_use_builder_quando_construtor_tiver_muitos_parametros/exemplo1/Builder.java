package src._2_use_builder_quando_construtor_tiver_muitos_parametros.exemplo1;

public class Builder {
    // Parâmetros obrigatórios
   final int servingSize;
    final int servings;

    // Parâmetros Opcionais -  inicializado com valores padões
    int calories = 0;
    int fat = 0;
    int sodium = 0;
    int carbohydrate = 0;

    // Construtor público
    public Builder(int servingSize, int servings) {
        this.servingSize = servingSize;
        this.servings = servings;
    }

    public Builder calories(int val) {
        calories = val;
        return this;
    }

    public Builder fat(int val) {
        fat = val;
        return this;
    }

    public Builder sodium(int val) {
        sodium = val;
        return this;
    }

    public Builder carbohydrate(int val) {
        carbohydrate = val;
        return this;
    }

    public NutritionFacts build() {
        return new NutritionFacts(this);
    }

}
