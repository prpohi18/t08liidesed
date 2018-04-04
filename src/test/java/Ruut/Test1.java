package Ruut;
import org.junit.*;
import static org.junit.Assert.*;


public class Test1 {

	@Test
	public void ruuduKontroll(){
		ruut p1=new ruut(6);
		ruut s1=new ruut(6);
		
//		ruut p2=new ruut(8);
//		ruut s2=new ruut(8);
		
		assertEquals(24, p1.kysiYmberm66t());
		assertEquals(36, s1.kysiPindala());
		
//		assertEquals(32, p2.kysiYmberm66t());
//		assertEquals(64, s2.kysiPindala());
	}

	@Test
	public void vastuseliides() {
		vastuseliides komplekt = new komplekt();
		komplekt.lisaRuut(new ruut(6));
//		komplekt.lisaRuut(new ruut(8));
	}
}


/*

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.866s
[INFO] Finished at: Tue Apr 03 11:41:10 EEST 2018
[INFO] Final Memory: 12M/243M
[INFO] ------------------------------------------------------------------------

*/

