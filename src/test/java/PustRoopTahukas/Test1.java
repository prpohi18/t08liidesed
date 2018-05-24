package PustRoopTahukas;
import org.junit.*;
import static org.junit.Assert.*;

public class Test1{
	@Test
	public void pindalaTest(){
		Liides test = new Arvutused();
		assertEquals(265.32, test.pindala(12.3, 7.5, 4.7), 0.01);
	}

	@Test
	public void ruumalaTest(){
		Liides test = new Arvutused();
		assertEquals(186.12, test.ruumala(12.3, 7.5, 4.7), 0.01);
	}

}