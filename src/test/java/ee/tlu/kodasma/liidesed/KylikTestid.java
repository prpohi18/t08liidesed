package ee.tlu.kodasma.liidesed;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class KylikTestid {
    Ristkylik ristkylik = new Ristkylik();
    
    @Test
    public void umbermootTest() {
        assertEquals(10, ristkylik.umbermoot(2, 3), 0.01);
        assertEquals(16.4, ristkylik.umbermoot(3.7, 4.5), 0.01);
    }
    
    @Test
    public void pindalaTest() {
        assertEquals(6, ristkylik.pindala(2, 3), 0.01);
        assertEquals(17.02, ristkylik.pindala(3.7, 4.6), 0.01);
    }
}
