package src._11_prefira_hierarquia_de_classes_ao_inves_de_classes_tagged.exemplo2;

class Retangulo extends Figura {
    private final double comprimento;
    private final double largura;

    Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    double area() {
        return comprimento * largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

}
