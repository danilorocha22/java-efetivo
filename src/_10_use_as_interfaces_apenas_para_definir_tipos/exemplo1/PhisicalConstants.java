package src._10_use_as_interfaces_apenas_para_definir_tipos.exemplo1;

//Exemplo de uso errado/antipadrão da interface como interface-constante
public interface PhisicalConstants {

    // Número do Avogrado (1/mol)
    static final double AVOGADROS_NUMBER = 6.022_140_857e23;

    // Constante Boltzmann (J/K)
    static final double BOLTZMANN_CONSTANT = 1.380_648_52e-23;

    // Massa do elétron (kg)
    static final double ELECTRON_MASS = 9.109_383_56e-31;

}
