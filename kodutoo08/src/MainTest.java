import static org.junit.Assert.*;
import org.junit.*;

public class MainTest {
    Main a = new Main();
    @Test
    public void powerTest() {
        assertEquals(9.0, a.power(3, 2), 0.0);
        assertEquals(27.0, a.power(3, 3), 0.0);
        assertEquals(49.0, a.power(7, 2), 0.0);
    }

    @Test
    public void productTest() {
        assertEquals(60.0, a.product(15, 4), 0.0);
        assertEquals(9.0, a.product(3, 3), 0.0);
        assertEquals(56.0, a.product(7, 8), 0.0);
    }
}