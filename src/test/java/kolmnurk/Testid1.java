package kolmnurk;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid1{
	@Test
	public void ylesandeLoomine(){
		KolmnurgaYlesanne y1=new KolmnurgaYlesanne(3, 2);
		assertEquals(3, y1.kysiPindala());
	}
	
	public void ylesandeLoomineLiidesest(){
		KolmnurgaYlesanneteLoojaLiides looja=null;
		KolmnurgaYlesanne y1=looja.looKolmnurgaYlesanne(100);
		assertTrue(y1.kysiPindala()<=100);
		assertEquals(y1.kysiPindala(), (y1.kysiKylg1()*y1.kysiKorgus())/2);
	}
}
/*
T E S T S
-------------------------------------------------------
Running pranglimine.Testid1
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.092 sec
Running kolmnurk.Testid1
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.344s
[INFO] Finished at: Mon Apr 02 09:34:52 EEST 2018
[INFO] Final Memory: 9M/243M
[INFO] ------------------------------------------------------------------------

*/