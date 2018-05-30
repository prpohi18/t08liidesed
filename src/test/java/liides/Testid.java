package liides;
import org.junit.*;
import static org.junit.Assert.*;

public class Testid {
    Trapets esimene = new Trapets();
    @Test
    public void ymbermootTest() {
        assertEquals(12.0, esimene.ymbermoot(4, 2, 3, 3), 0.0);
        assertEquals(16.0, esimene.ymbermoot(6, 5, 2, 3), 0.0);
    }

    @Test
    public void keskloikTest() {
        assertEquals(4.0, esimene.keskloik(3, 5), 0.0);
        assertEquals(4.5, esimene.keskloik(5, 4), 0.0);
    }

    @Test
    public void pindalaTest() {
        assertEquals(9.2, esimene.pindala(3, 5, 2.3), 0.0);
        assertEquals(11.25, esimene.pindala(5, 4, 2.5), 0.0);
    }
}
