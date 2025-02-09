package dev.karina.imc_java.view;

import java.util.Scanner;

public class IMCView {
    private Scanner scanner;

    public IMCView(){
        scanner = new Scanner(System.in);
    }

    public double getWeight(){
        System.out.println("Introduce tu peso en kg: ");
        return scanner.nextDouble();
    }

    public double getHeight(){
        System.out.println("Introduce tu estatura en cm");
        return scanner.nextDouble();
    }

    public void showResults(double imc, String category){
        System.out.printf("Tu IMC es: %.2f%n", imc);
        System.out.println("Categoría: " + category);
    }
}
