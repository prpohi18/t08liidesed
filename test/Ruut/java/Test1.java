package Ruut;
import org.junit.*;
import org.junit.Assert.*;


public class Test1 {

	@Test
	public void ruuduKontroll(){
		ruut p1=new ruut(4);
		ruut s1=new ruut(4);
		
//		ruut p2=new ruut(8);
//		ruut s2=new ruut(8);
		
		assertEquals(16, p1.kysiYmberm66t());
		assertEquals(16, s1.kysiPindala());
		
//		assertEquals(32, p2.kysiYmberm66t());
//		assertEquals(64, s2.kysiPindala());

	}

	@Test
	public void vastuseliides() {
		vastuseliides komplekt = new komplekt();
		komplekt.lisaRuut(new ruut(4));
//		komplekt.lisaRuut(new ruut(8));
	}
}


/*[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 4.718s
[INFO] Finished at: Tue Apr 03 08:37:52 EEST 2018
[INFO] Final Memory: 12M/243M
[INFO] ------------------------------------------------------------------------*/


