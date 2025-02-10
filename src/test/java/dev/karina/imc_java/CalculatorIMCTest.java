package dev.karina.imc_java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorIMCTest {

    private CalculatorIMC imcCalc;
        @BeforeEach
        void Setup(){
            imcCalc = new CalculatorIMC(70, 1.75);
        }

        @Test
        @DisplayName("Calcula el IMC correcta")
        void testCalculatorIMC(){
            double expectedIMC = 70 / Math.pow(1.75, 2);
            assertEquals(expectedIMC, imcCalc.calculatedIMC(), 0.01);
        }
}
