import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraDescuentosTest {
    
    CalculadoraDescuentos calc = new CalculadoraDescuentos();

    @Test
    public void testDescuentoPorcentaje(){
        double resultado = calc.aplicarDescuentoProcentaje(100, 10);
        assertEquals(90, resultado);
    
    }

    @Test
    public void testDescuentoFijo(){
        double resultado = calc.aplicarDescuentoFijo(100, 5);
        assertEquals(95, resultado);
    }

    
}
