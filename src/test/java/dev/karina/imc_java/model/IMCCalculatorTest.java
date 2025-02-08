package dev.karina.imc_java.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IMCCalculatorTest {
    
    @Test
    public void testCalculateIMC(){
        IMCCalculator imcCalculator = new IMCCalculator();
        double imc = imcCalculator.calculateIMC(88, 1.80);
        assertEquals(24.9, imc, 0.02);
    }
}
