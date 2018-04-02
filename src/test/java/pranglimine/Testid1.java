package pranglimine;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid1{
    @Test
    public void ylesandeLoomine(){
        Protsendiylesanne yl=new Protsendiylesanne(15, 8);
        assertEquals("8/15=", yl.toString());
		System.out.println(yl.kysiProtsent());
        assertEquals(53, yl.kysiProtsent(), 0.1);
    }
    @Test
    public void ylesandeLoomineLiidesest(){
        ProtsendiLoojaLiides looja=new ProtsendiTavalineLooja();
        Protsendiylesanne yl=looja.looProtsendiylesanne(50);
        assertTrue(yl.kysiVisked()<=50);
		int tegelik = (int)(Math.round(yl.kysiTabamised()*100.0/yl.kysiVisked()));
        assertEquals(yl.kysiProtsent(), tegelik, 0.1);
		assertTrue(yl.kysiVisked()>=yl.kysiTabamised());
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