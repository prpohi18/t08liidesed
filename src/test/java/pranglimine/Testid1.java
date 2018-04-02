package pranglimine;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid1{
    @Test
    public void RuuduPindalaLoomine(){
        RuuduPindala rp1=new RuuduPindala(3);
        assertEquals("3*3=", rp1.toString());
        assertEquals(9, rp1.kysiVastus());
    }
    @Test
    public void RuuduPindalaLoomineLiidesest(){
        RuuduPindalaLoojaLiides looja1=new RuuduPindalaTavalineLooja();
        RuuduPindala rp1=looja1.looRuuduPindala(5);
        assertEquals(rp1.kysiVastus(), rp1.kysiKylg()*rp1.kysiKylg());
    }

    @Test
    public void RistkylikuPindalaLoomine(){
        RistkylikuPindala rkp1=new RistkylikuPindala(3, 4);
        assertEquals("3*4=", rkp1.toString());
        assertEquals(12, rkp1.kysiVastus());
    }
    @Test
    public void RistkylikuPindalaLoomineLiidesest(){
        RistkylikuPindalaLoojaLiides looja2=new RistkylikuPindalaTavalineLooja();
        RistkylikuPindala rkp1=looja2.looRistkylikuPindala(5, 10);
        assertEquals(rkp1.kysiVastus(), rkp1.kysiKylg1()*rkp1.kysiKylg2());
    }

	
    
}