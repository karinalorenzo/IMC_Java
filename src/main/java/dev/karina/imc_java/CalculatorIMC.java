package dev.karina.imc_java;

public class CalculatorIMC {

    private double weight;
    private double height;

    public CalculatorIMC(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculatedIMC() {
        return weight / Math.pow(height, 2);
    }

    public String clasificateIMC() {
        double imc = calculatedIMC();

        if (imc < 16) {
            return "Severe thinness";
        } else if (imc >= 16 && imc < 17) {
            return "Moderate thinness";
        } else if (imc >= 17 && imc < 18.5) {
            return "Mild thinness";
        } else if (imc >= 18.5 && imc < 25) {
            return "Normal weight";
        } else if (imc >= 25 && imc < 30) {
            return "Overweight";
        } else if (imc >= 30 && imc < 35) {
            return "Moderate obesity";
        } else if (imc >= 35 && imc < 40) {
            return "Mild obesity";
        } else {
            return "Morby obesity";
        }
    }

    public static void main(String[] args) {
        CalculatorIMC imcCImc = new CalculatorIMC(70, 1.75);
        System.out.println("IMC: " + imcCImc.calculatedIMC());
        System.out.println("Clasificación: " + imcCImc.clasificateIMC());
    }
}
