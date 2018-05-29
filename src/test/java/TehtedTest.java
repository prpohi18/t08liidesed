import org.junit.Test;

import static org.junit.Assert.*;

public class TehtedTest {
    Tehted uus = new Tehted();

    @Test
    public void aste() {
        assertEquals(9.0, uus.aste(3, 2), 0.0);
        assertEquals(27.0, uus.aste(3, 3), 0.0);
        assertEquals(36.0, uus.aste(6, 2), 0.0);
    }

    @Test
    public void korrutis() {
        assertEquals(28.0, uus.korrutis(7, 4), 0.0);
        assertEquals(6.0, uus.korrutis(2, 3), 0.0);
        assertEquals(48.0, uus.korrutis(6, 8), 0.0);
    }
}