package dev.karina.imc_java.controller;

import dev.karina.imc_java.model.IMCCalculator;
import dev.karina.imc_java.model.IMCCategorizer;
import dev.karina.imc_java.model.IMCCategorizerImpl;
import dev.karina.imc_java.view.IMCView;

public class IMCController {
    private IMCCalculator imcCalculator;
    private IMCCategorizer imcCategorizer;
    private IMCView imcView;

    // constructor para inicializar el contorlador con los componentes de model y
    // view

    public IMCController(IMCCalculator imcCalculator, IMCCategorizer imcCategorizer, IMCView imcView) {
        this.imcCalculator = imcCalculator;
        this.imcCategorizer = imcCategorizer;
        this.imcView = imcView;
    }

    // método para calcular and mostrar el IMC

    public void calculateAndShowIMC() {
        double weight = imcView.getWeight();
        double height = imcView.getHeight();
        double imc = imcCalculator.calculateIMC(weight, height);
        String category = ((IMCCategorizerImpl) imcCategorizer).categorizeIMC(imc);
        imcView.showResults(imc, category);
    }
}
