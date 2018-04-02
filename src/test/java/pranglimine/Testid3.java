package pranglimine;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid3{
	@Test
    public void ylesandeLoomine(){
        Pindalaylesanne yl=new Pindalaylesanne(3, 2);
        assertEquals("3*2=", yl.toString());
        assertEquals(6, yl.kysiPindala());
    }		

	    @Test
    public void ylesandeLoomineLiidesest(){
        PindalaylesanneteLoojaLiides looja=new PindalaylesanneteTavalineLooja();
        Pindalaylesanne yl=looja.looPindalaylesanne(100);
        assertTrue(yl.kysiPindala()<=100);
        assertEquals(yl.kysiPindala(), yl.kysiKylg1()*yl.kysiKylg2());
    }	
	
	    @Test
    public void juhuarvuLoomine(){
        JuhuarvudeGeneraatoriLiides generaator=new JuhuarvudeYhtlaneGeneraator();
        boolean yksLeitud=false;
        boolean viisLeitud=false;
        for(int i=1; i<1000; i++){
            int arv=generaator.looJuhuarv(1, 5);
            assertTrue(arv>=1);
            assertTrue(arv<=5);
            if(arv==1){yksLeitud=true;}
            if(arv==5){viisLeitud=true;}
        }
        assertTrue(yksLeitud);
        assertTrue(viisLeitud);
    }
}