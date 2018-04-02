package ristkylik;
import org.junit.*;
import static org.junit.Assert.*;
public class Test1{
    @Test
    public void pindalaTest1(){
        RistkylikuPindalaLiides yl=new RistkylikuPindalaLeidmine();
        assertEquals(6, yl.leiaPindala(2, 3));
    }
	
	@Test
    public void pindalaTest2(){
        RistkylikuPindalaLiides yl=new RistkylikuPindalaLeidmine();
		assertEquals(20, yl.leiaPindala(4, 5));
    }
	
	@Test
    public void pindalaTest3(){
        RistkylikuPindalaLiides yl=new RistkylikuPindalaLeidmine();
		assertEquals(5, yl.leiaPindala(1, 5));
    }
	
	@Test
    public void pindalaTest4(){
        RistkylikuPindalaLiides yl=new RistkylikuPindalaLeidmine();
		assertEquals(2, yl.leiaPindala(1, 1));
    }
	
	@Test
    public void pindalaTest5(){
        RistkylikuPindalaLiides yl=new RistkylikuPindalaLeidmine();
		assertEquals(19, yl.leiaPindala(2, 10));
    }
}