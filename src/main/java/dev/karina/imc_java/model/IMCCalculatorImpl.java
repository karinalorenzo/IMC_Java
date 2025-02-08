package dev.karina.imc_java.model;

public class IMCCalculatorImpl implements IMCCalculator {

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
}

