package src._10_use_as_interfaces_apenas_para_definir_tipos.exemplo2;

//Exemplo de uso certo de constantes com classe utilitária oa invés de interface
public class PhisicalConstants {

    private PhisicalConstants() {} //Evita a instaciação da classe utilitária

    // Número do Avogrado (1/mol)
    public static final double AVOGADROS_NUMBER = 6.022_140_857e23;

    // Constante Boltzmann (J/K)
    public static final double BOLTZMANN_CONSTANT = 1.380_648_52e-23;

    // Massa do elétron (kg)
    public static final double ELECTRON_MASS = 9.109_383_56e-31;
    
}
