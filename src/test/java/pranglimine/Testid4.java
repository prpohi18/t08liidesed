package pranglimine;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid4{
	@Test
    public void ylesandeLoomine(){
        Ringiylesanne yl=new Ringiylesanne(5, Math.PI);
        assertEquals("25.0*3.141592653589793=", yl.toString());
        assertEquals(78.54, yl.kysiRingiPindala(), 0.01);
    }		

	/*    @Test
    public void ylesandeLoomineLiidesest(){
        RingiylesanneteLoojaLiides looja=new RingiylesanneteTavalineLooja();
        Ringiylesanne yl=looja.looRingiylesanne(100);
        assertTrue(yl.kysiPindala()<=100);
        assertEquals(yl.kysiPindala(), yl.kysiRaadius());
    }	*/

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
/*
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running pranglimine.Testid1
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.1 sec
Running pranglimine.Testid2
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec
Running pranglimine.Testid3
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.017 sec
Running pranglimine.Testid4
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec

Results :

Tests run: 11, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.930s
[INFO] Finished at: Mon Apr 02 08:45:41 EEST 2018
[INFO] Final Memory: 9M/243M
[INFO] ------------------------------------------------------------------------
[tammkert@greeny t08liidesed]$
*/