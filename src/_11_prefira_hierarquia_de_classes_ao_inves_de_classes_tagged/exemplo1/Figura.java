package src._11_prefira_hierarquia_de_classes_ao_inves_de_classes_tagged.exemplo1;

// Classe tagged - substancialmente inferior a hierarquia de classes
/**
 * As classes tagged apresentam inúmeros inconvenientes. Elas estão
 * repletas de boilerplates, incluindo declarações enum, campos de tags e
 * instruções switch. Prejudica-se substancialmente a legibilidade porque
 * existem inúmeras implementações emaranhadas dentro de uma única classe.
 * O volume de memória aumenta, pois as instâncias são carregadas com
 * campos irrelevantes pertencentes às outras opções. Os campos não podem
 * ser definidos como finais, a menos que os construtores inicializem os
 * campos irrelevantes, resultando em mais boilerplate.
 */
class Figura {
    enum Forma { CIRCULO, RETANGULO };

    // Campo da tag - forma da figura
    final Forma forma;

    // Campos usados apenas se a figura for um Retângulo
    double comprimento;
    double largura;

    // Capo usado se a figura for um Circulo
    double raio;

    // Construtor do circulo
    Figura(double raio) {
        forma = Forma.CIRCULO;
        this.raio = raio;
    }

    // Construtor do retagulo
    Figura(double comprimento, double largura) {
        forma = Forma.RETANGULO;
        this.comprimento = comprimento;
        this.largura = largura;
    }

    double area() {
        switch (forma) {
            case RETANGULO -> { return comprimento * largura; }
            case CIRCULO -> { return Math.PI * (raio * raio); }
            default -> throw new AssertionError(forma);
        }
    }

}
