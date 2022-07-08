package src._10_use_as_interfaces_apenas_para_definir_tipos.exemplo2;

import static src._10_use_as_interfaces_apenas_para_definir_tipos.exemplo2.PhisicalConstants.AVOGADROS_NUMBER;

// As duas forma de uso da constante são aceitáveis
public class Test {
    // Uso da constante com importação estática
    double atoms(double mols) {
        return AVOGADROS_NUMBER * mols;
    }

    // Uso da constante com com chamada da classe
    double electro_mass() {
        return PhisicalConstants.BOLTZMANN_CONSTANT;
    }


}
