package dev.karina.imc_java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorIMCTest {

    private CalculatorIMC imcCalc;

    @BeforeEach
    void Setup() {
        imcCalc = new CalculatorIMC(70, 1.75);
    }

    @Test
    @DisplayName("Calcula el IMC correctamente")
    void testCalculatorIMC() {
        double expectedIMC = 70 / Math.pow(1.75, 2);
        assertEquals(expectedIMC, imcCalc.calculatedIMC(), 0.01);
    }

    @Test
    @DisplayName("Clasifica correctamente: delgadez severa")
    void testClasificateSevereThinness() {
        CalculatorIMC imcCalc = new CalculatorIMC(45, 1.75);
        assertEquals("Severe thinness", imcCalc.clasificateIMC());
    }


    @Test
    @DisplayName("Clasifica correctamente: delgadez moderada")
    void testClasificateModerateThinness() {
        CalculatorIMC imcCalc = new CalculatorIMC(50, 1.75);
        assertEquals("Moderate thinness", imcCalc.clasificateIMC());
    }

    @Test
    @DisplayName("Clasifica correctamente: delgadez leve")
    void testClasificateMildThinness() {
        CalculatorIMC imcCalc = new CalculatorIMC(55, 1.75);
        assertEquals("Mild thinness", imcCalc.clasificateIMC());
    }

    @Test
    @DisplayName("Clasifica correctamente: peso normal")
    void testClasificateNormalWeight() {
        CalculatorIMC imcCalc = new CalculatorIMC(70, 1.75);
        assertEquals("Normal weight", imcCalc.clasificateIMC());
    }

    @Test
    @DisplayName("Clasifica correctamente: sobrepeso")
    void testClasificateOverweight() {
        CalculatorIMC imcCalc = new CalculatorIMC(85, 1.75);
        assertEquals("Overweight", imcCalc.clasificateIMC());
    }

    @Test
    @DisplayName("Clasifica correctamente: obesidad moderada")
    void testClasificateModerateObesity() {
        CalculatorIMC imcCalc = new CalculatorIMC(95, 1.75);
        assertEquals("Moderate obesity", imcCalc.clasificateIMC());
    }

    @Test
    @DisplayName("Clasifica correctamente: obesidad leve")
    void testClasificateMildObesity() {
        CalculatorIMC imcCalc = new CalculatorIMC(110, 1.75);
        assertEquals("Mild obesity", imcCalc.clasificateIMC());
    }

    @Test
    @DisplayName("Clasifica correctamente: obesidad mórbida")
    void testClasificateMorbyObesity() {
        CalculatorIMC imcCalc = new CalculatorIMC(130, 1.75);
        assertEquals("Morby obesity", imcCalc.clasificateIMC());
    }





}
