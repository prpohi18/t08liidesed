package kaheksa;
import org.junit.*;
import static org.junit.Assert.*;

public class Test1{
	@Test
	public void kuupjuurTest1(){
		Interface y1 = new Kuupjuur();
		assertEquals(5.0, y1.f(125.0), 0.01);
	}
	
	@Test
	public void kuupjuurTest2(){
		Interface y1 = new Kuupjuur();
		assertEquals(3.0, y1.f(27.0), 0.01);
	}
}