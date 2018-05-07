package trapets;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid2{
	@Test
	public void arvutamiseKontroll(){
		TrapetsiArvutamineLiides pin = new TrapetsiArvutamine();
		assertEquals(40.0, pin.arvutamine(4.0, 6.0, 8.0), 0.01);
	}
		
}