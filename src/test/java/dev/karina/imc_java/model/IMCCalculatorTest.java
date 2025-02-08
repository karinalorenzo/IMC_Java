package dev.karina.imc_java.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IMCCalculatorTest {

    @Test
    public void testCalculateIMC() {
        IMCCalculator imcCalculator = new IMCCalculatorImpl();
        double imc = imcCalculator.calculateIMC(70, 1.75);
        System.out.println("IMC calculado: " + imc);
        assertEquals(22.86, imc, 0.2);
    }
}


