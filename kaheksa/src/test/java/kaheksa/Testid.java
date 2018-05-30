package kaheksa;
import org.junit.*;
import static org.junit.Assert.*;

public class Testid {
    Arvutused a = new Arvutused();
    @Test
    public void pythTest() {
        assertEquals(6.403, a.pyth(5, 4), 0.0);
        assertEquals(3.606, a.pyth(2, 3), 0.0);
        assertEquals(8.485, a.pyth(6, 6), 0.0);
    }

    @Test
    public void pindalaTest() {
        assertEquals(10.0, a.pindala(5, 4), 0.0);
        assertEquals(3.0, a.pindala(2, 3), 0.0);
        assertEquals(18.0, a.pindala(6, 6), 0.0);
    }

    @Test
    public void umberTest() {
        assertEquals(8.606, a.umbermoot(2, 3, 3.605), 0.0);
        assertEquals(24, a.umbermoot(6, 8, 10), 0.0);
        assertEquals(34.422, a.umbermoot(12, 8, 14.422), 0.0);
    }
}