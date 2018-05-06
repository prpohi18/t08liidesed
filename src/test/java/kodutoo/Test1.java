package kodutoo;
import org.junit.*;
import static org.junit.Assert.*;
public class Test1{
	@Test
	public void pindalaTest1(){
		KolmnurgaPindala y1=new KolmnurgaValem();
		assertEquals(5, y1.leiamePindala(5, 2));
	}
	@Test
	public void pindalaTest2(){
		KolmnurgaPindala y2=new KolmnurgaValem();
		assertEquals(16, y2.leiamePindala(8,4));
	}
	@Test
	public void pindalaTest3(){
		KolmnurgaPindala y3=new KolmnurgaValem();
		assertEquals(50, y3.leiamePindala(20,5));
	}
}