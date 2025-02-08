package dev.karina.imc_java.model;

public class IMCCategorizerImpl implements IMCCategorizer {

    @Override
    public double calculateIMC(double weight, double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que 0");
        }
        if (weight <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor que 0");
        }
        return weight / (height * height);
    }

    public String categorizeIMC(double imc) {
        if (imc < 18.5) {
            return "Tu peso es bajo";
        } else if (imc >= 18.5 && imc < 25) {
            return "Tu peso es normal";
        } else if (imc >= 25 && imc < 30) {
            return "Tienes sobrepeso";
        } else {
            return "Tienes un nivel de obesidad considerable";
        }
    }
}
