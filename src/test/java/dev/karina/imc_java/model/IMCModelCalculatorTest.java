package dev.karina.imc_java.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IMCModelCalculatorTest {

    private IMCModelCalculator imc; // variable de instancia para IMCModelCalculator


    @BeforeEach
    void setUp(){
        imc = new IMCModelCalculator(88, 1.80); // objeto con valores por defecto
    }

    @Test
    @DisplayName("Calcular correctamente el IMC")
    void calculateIMC_correctValue(){
        double result = imc.calculateIMC();

        //Verificamos el resultado, margen de error del 0.03
        assertEquals(24.9, result, 0.03);
    }
}
