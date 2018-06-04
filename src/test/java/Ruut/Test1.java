package Ruut;
import org.junit.*;
import static org.junit.Assert.*;


public class Test1 {

	@Test
	public void ruuduKontroll(){
            ruut p1=new ruut(6);
            ruut s1=new ruut(6);
		

		
		assertEquals(24, p1.kysiYmberm66t());
		assertEquals(36, s1.kysiPindala());
		

	}

	@Test
	public void vastuseliides() {
		vastuseliides komplekt = new komplekt();
		komplekt.lisaRuut(new ruut(6));
	}
}