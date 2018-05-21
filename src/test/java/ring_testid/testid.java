package ring_testid;
import org.junit.*;
import ring.Komplekt;
import ring.ring;
import ring.VastusteKomplektiLiides;
import static org.junit.Assert.*;


public class testid {

    @Test
    public void ringiKontroll(){
        ring s1 = new ring(5);
        ring p1 = new ring(8);
        assertEquals(78.5, s1.kysiPindala(), 1);
        assertEquals(31.4, s1.kysiYmbermoot(), 1);
    }

    @Test
    public void vastusteKomplektiLoomine(){
        VastusteKomplektiLiides komplekt = new Komplekt();
        komplekt.lisaRing(new ring(5));
        komplekt.lisaRing(new ring(8));

    }
}
