package kaheksas;

import org.junit.*;
import static org.junit.Assert.*;

public class FunktsioonideTest {
    @Test
    public void Arvutamine1() {
        ArvutaVastus ans = new ArvutaVastus();
        assertEquals("7B", ans.arvutus(123));
    }
    
    @Test
    public void Arvutamine2() {
        ArvutaVastus ans = new ArvutaVastus();
        assertEquals("1A4", ans.arvutus(420));
    }
    
    @Test
    public void Arvutamine3() {
        ArvutaVastus ans = new ArvutaVastus();
        assertEquals("539", ans.arvutus(1337));
    }
}