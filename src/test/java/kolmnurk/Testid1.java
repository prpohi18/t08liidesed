package kolmnurk;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid1{
	@Test
	public void KolmnurgaTest1(){
		KolmnurgaYlesanneteLoojaLiides y1=new KolmnurgaYlesanne();
		assertEquals(3, y1.KolmnurgaPindalaLeidmine(3, 2));
	}
	
	@Test
	public void KolmnurgaTest2(){
		KolmnurgaYlesanneteLoojaLiides y1=new KolmnurgaYlesanne();
		assertEquals(6, y1.KolmnurgaPindalaLeidmine(6, 2));
	}
	
	@Test
	public void KolmnurgaTest3(){
		KolmnurgaYlesanneteLoojaLiides y1=new KolmnurgaYlesanne();
		assertEquals(12, y1.KolmnurgaPindalaLeidmine(8, 3));
	}
}
/*
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running pranglimine.Testid1
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.089 sec
Running kolmnurk.Testid1
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec

Results :

Tests run: 4, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2.439s
[INFO] Finished at: Mon Apr 02 10:17:52 EEST 2018
[INFO] Final Memory: 12M/243M
[INFO] ------------------------------------------------------------------------
*/