package rakendusTest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 *@author Hendrik
 */

public class RakendusTest {
    Rakendus ruut = new Rakendus();
    
    @Test
    public void umbermootTest() {        
        assertEquals(8, ruut.umbermoot(2,2), 0.01);
        assertEquals(10, ruut.umbermoot(3,2), 0.01);
    }

    @Test
    public void pindalaTest() {
        assertEquals(4, ruut.pindala(2,2), 0.01);
        assertEquals(6, ruut.pindala(3,2), 0.01);
    }
    
}