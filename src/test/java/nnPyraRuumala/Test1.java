package NeljanurkuPindala;
import org.junit.*;
import static org.junit.Assert.*;
public class Test1{
    @Test
    public void pindalaTest1(){
        NeljanurkuPindalaLiides yl=new NeljanurkuPindalaLeidmine();
        assertEquals(60.00, yl.pindala(5.0, 12.0), 0.01);
    }
	
	@Test
    public void pindalaTest2(){
        NeljanurkuPindalaLiides yl=new NeljanurkuPindalaLeidmine();
        assertEquals(2300.00, yl.pindala(46.0, 50.0), 0.01);
    }
	
	@Test
    public void pindalaTest3(){
        NeljanurkuPindalaLiides yl=new NeljanurkuPindalaLeidmine();
        assertEquals(15.84, yl.pindala(3.3, 4.8), 0.01);
    }
	
	@Test
    public void pindalaTest4(){
        NeljanurkuPindalaLiides yl=new NeljanurkuPindalaLeidmine();
        assertEquals(75.66, yl.pindala(9.7, 7.8), 0.01);
    }
	
	@Test
	public void pindalaTest5(){
        NeljanurkuPindalaLiides yl=new NeljanurkuPindalaLeidmine();
        assertEquals(18.48, yl.pindala(2.2, 8.4), 0.01);
    }
} 