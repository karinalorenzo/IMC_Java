package dev.karina.imc_java.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class IMCCategorizerTest {

    @Test
    public void testCalculateIMC() {
        IMCCategorizerImpl imcCalculator = new IMCCategorizerImpl();
        double imc = imcCalculator.calculateIMC(88, 1.80);
        assertEquals(27.16, imc, 0.01);
    }

    @Test
    public void testCategorizeIMC() {
        IMCCategorizerImpl imcCategorizer = new IMCCategorizerImpl();
        assertEquals("Tu peso es bajo", imcCategorizer.categorizeIMC(17));
        assertEquals("Tu peso es normal", imcCategorizer.categorizeIMC(22));
        assertEquals("Tienes sobrepeso", imcCategorizer.categorizeIMC(27));
        assertEquals("Tienes un nivel de obesidad considerable", imcCategorizer.categorizeIMC(32));
    }

    @Test
    public void testCalculateIMCWithInvalidHeight() {
        IMCCategorizerImpl imcCalculator = new IMCCategorizerImpl();
        assertThrows(IllegalArgumentException.class, () -> {
            imcCalculator.calculateIMC(88, 0);
        });
    }

    @Test
    public void testCalculateIMCWithInvalidWeight() {
        IMCCategorizerImpl imcCalculator = new IMCCategorizerImpl();
        assertThrows(IllegalArgumentException.class, () -> {
            imcCalculator.calculateIMC(0, 1.80);
        });
    }
}
