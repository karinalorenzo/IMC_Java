package dev.karina.imc_java;

public class CalculatorIMC {

    private double weight;
    private double height;

    public CalculatorIMC(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double calculatedIMC(){
        return weight / Math.pow(height, 2);
    }
    

}
