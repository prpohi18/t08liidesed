package pranglimine;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid1{
	@Test
    public void ylesandeLoomine(){
        Lahutamisylesanne yl=new Lahutamisylesanne(3, 2);
        assertEquals("3-2=", yl.toString());
        assertEquals(1, yl.kysiSumma());
    }		

	    @Test
    public void ylesandeLoomineLiidesest(){
        LahutamisylesanneteLoojaLiides looja=new LahutamisylesanneteTavalineLooja();
        Lahutamisylesanne yl=looja.looLahutamisylesanne(100);
        assertTrue(yl.kysiSumma()<=100);
        assertEquals(yl.kysiSumma(), yl.kysiLahutatav1()-yl.kysiLahutatav2());
    }	

	    @Test
    public void juhuarvuLoomine(){
        JuhuarvudeGeneraatoriLiides generaator=new JuhuarvudeYhtlaneGeneraator();
        boolean yksLeitud=false;
        boolean viisLeitud=false;
        for(int i=0; i<1000; i++){
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