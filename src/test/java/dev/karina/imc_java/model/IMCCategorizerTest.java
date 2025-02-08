package dev.karina.imc_java.model;

import org.junit.jupiter.api.Test;

public class IMCCategorizerTest {
    @Test
    public void testCategorizerIMC(){
        IMCCalculatorImpl imcCategorizer = new IMCCalculatorImpl();
            assertEquals("Tu peso es peso", imcCategorizer.categorizerIMC(17));
            assertEquals("Tu peso es normal", imcCategorizer.categorizerIMC(22));
            assertEquals("Tienes sobrepeso", imcCategorizer.categorizerIMC(27));
            assertEquals("Tines un nivel de obesidad considerable", imcCategorizer.categorizerIMC(32));

    }
}
