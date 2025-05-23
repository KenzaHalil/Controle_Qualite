import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatriceTest {

    Calculatrice calculette = new Calculatrice();


    @Test
    void testAdd() {
        assertEquals(7.1f, calculette.add(3.1f, 4.0f));
        assertEquals(-1.0f, calculette.add(2.0f, -3.0f));
    }
    @Test
    void testMult() {
        assertEquals(12.0f, calculette.mult(3.0f, 4.0f));
        assertEquals(0.0f, calculette.mult(0.0f, 4.0f));
    }
    @Test
    void testDiv() {
        assertEquals(3.0f, calculette.div(6.0f, 2.0f));
        assertEquals(0.5f, calculette.div(1.0f, 2.0f));
    }
    @Test
    void testDivParZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculette.div(5.0f, 0.0f);
        });
        assertEquals("Div par 0", exception.getMessage());
    }

    @Test
    void testMinus(){
        assertEquals(1.0999999f, calculette.minus(2.1f, 1.0f));
        assertEquals(-0.9f, calculette.minus(1.1f, 2.0f));
    }
}
