package kaheksas;
import org.junit.*;
import static org.junit.Assert.*;

public class Testid {
    Arvutused o = new Arvutused();

    @Test
    public void pindalaTest() {
        assertEquals(3.0, o.pindala(2, 3), 0.0);
        assertEquals(24.0, o.pindala(12, 4), 0.0);
    }

    @Test 
    public void umbermootTest() {
        assertEquals(23, o.umbermoot(5, 7, 11), 0.0);
        assertEquals(134, o.umbermoot(100, 33, 1), 0.0);
    }
}