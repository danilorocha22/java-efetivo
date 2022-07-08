package src._11_prefira_hierarquia_de_classes_ao_inves_de_classes_tagged.exemplo2;

class Circulo extends Figura {

    private final double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double area() {
        return Math.PI * (raio * raio);
    }

    public double getRaio() {
        return raio;
    }
}
