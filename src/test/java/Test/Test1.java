
package KolmnurkPindala;
import org.junit.*;
import static org.junit.Assert.*;
public class Test1{
    @Test
    public void pindalaTest1(){
        KolmnurkPindalaLiides n1=new KolmnurkPindalaValem();
        assertEquals(6, n1.leiaPindala(2, 3));
    }
	
	@Test
    public void pindalaTest2(){
        KolmnurkPindalaLiides n1=new KolmnurkPindalaValem();
		assertEquals(12, n1.leiaPindala(4, 8));
    }
	
	@Test
    public void pindalaTest3(){
        KolmnurkPindalaLiides n1=new KolmnurkPindalaValem();
		assertEquals(24, n1.leiaPindala(9, 3));
    }
	
	@Test
    public void pindalaTest4(){
        KolmnurkPindalaLiides n1=new KolmnurkPindalaValem();
		assertEquals(3, n1.leiaPindala(3, 2));
    }

}