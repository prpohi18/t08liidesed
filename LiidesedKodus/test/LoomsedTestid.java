import liidesedkodus.Kass;
import liidesedkodus.Koer;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class LoomsedTestid {
    
    public LoomsedTestid() {
        
    }
    Koer koer1 = new Koer(7, "female");
    Kass kass1 = new Kass(2, "male");
    
    @Test
    public void koerOnIsane(){
        assertFalse(koer1.kasIsane());
    }
    
    @Test
    public void kassOnIsane(){
        assertTrue(kass1.kasIsane());
    }
    
}
