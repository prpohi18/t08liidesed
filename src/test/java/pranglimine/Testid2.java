package pranglimine;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid2{
	@Test
    public void ylesandeLoomine(){
        Jagamisylesanne yl=new Jagamisylesanne(3, 2);
        assertEquals("3/2=", yl.toString());
        assertEquals(1, yl.kysiSumma());
    }		

	    @Test
    public void ylesandeLoomineLiidesest(){
        JagamisylesanneteLoojaLiides looja=new JagamisylesanneteTavalineLooja();
        Jagamisylesanne yl=looja.looJagamisylesanne(100);
        assertTrue(yl.kysiSumma()<=100);
        assertEquals(yl.kysiSumma(), yl.kysiJagatav1()/yl.kysiJagatav2());
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