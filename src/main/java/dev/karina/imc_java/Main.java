package dev.karina.imc_java;

import dev.karina.imc_java.model.IMCCalculator;
import dev.karina.imc_java.model.IMCCalculatorImpl;
import dev.karina.imc_java.model.IMCCategorizer;
import dev.karina.imc_java.model.IMCCategorizerImpl;
import dev.karina.imc_java.view.IMCView;
import dev.karina.imc_java.controller.IMCController;

public class Main {
    
    public static void main(String[] args) {
        
        // instancias del modelo y la vista

        IMCCalculator imcCalculator = new IMCCalculatorImpl();
        IMCCategorizer imcCategorizer = new IMCCategorizerImpl();
        IMCView imcView = new IMCView();

        // instancias del controlador
            IMCController imcController = new IMCController(imcCalculator, imcCategorizer, imcView);

        // calcular y mostrar resultados
        imcController.calculateAndShowIMC();
    }
}
