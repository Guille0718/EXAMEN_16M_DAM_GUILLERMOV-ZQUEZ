package E.D;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraBasicaTest {
	
    @Test
    public void testSuma() {
        double a = 5.0;
        double b = 3.0;
        double resultadoEsperado = 8.0;
        String operacion = "+";

        double resultado = CalculadoraBasica.calcularResultado(a, b, operacion.charAt(0));

        assertEquals(resultadoEsperado, resultado, 0.01);
    }

    @Test
    public void testResta() {
        double a = 5.0;
        double b = 3.0;
        double resultadoEsperado = 2.0;
        String operacion = "-";

        double resultado = CalculadoraBasica.calcularResultado(a, b, operacion.charAt(0));

        assertEquals(resultadoEsperado, resultado, 0.01);
    }

    @Test
    public void testMultiplicacion() {
        double a = 5.0;
        double b = 3.0;
        double resultadoEsperado = 15.0;
        String operacion = "x";

        double resultado = CalculadoraBasica.calcularResultado(a, b, operacion.charAt(0));

        assertEquals(resultadoEsperado, resultado, 0.01);
    }

    @Test
    public void testDivision() {
        double a = 5.0;
        double b = 2.0;
        double resultadoEsperado = 2.5;
        String operacion = "/";

        double resultado = CalculadoraBasica.calcularResultado(a, b, operacion.charAt(0));

        assertEquals(resultadoEsperado, resultado, 0.01);
    }
}
