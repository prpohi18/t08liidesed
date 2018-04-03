package arvutused;
import org.junit.*;
import static org.junit.Assert.*;

public class Testid {
	RuutvorrandiLiides vorrand=new Ruutvorrand();
	
	@Test
	public void uusDiskriminant() {
		assertEquals(9.0, vorrand.diskriminant(2.0, 5.0, 2.0), 0.01);
	}

	@Test
	public void vorrandiTest1(){
		assertEquals(-0.5, vorrand.ruutvorrand1(2.0, 5.0, 2.0, vorrand.diskriminant(2.0, 5.0, 2.0)), 0.01);
	}
	
	@Test
	public void vorrandiTest2(){
		assertEquals(-2.0, vorrand.ruutvorrand2(2.0, 5.0, 2.0, vorrand.diskriminant(2.0, 5.0, 2.0)), 0.01);
	}
	
}
/*
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running arvutused.Testid
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.092 sec

Results :

Tests run: 3, Failures: 0, Errors: 0, Skipped: 0

*/