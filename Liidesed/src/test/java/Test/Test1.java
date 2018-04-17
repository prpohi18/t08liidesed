package NelinurkPindala;
import org.junit.*;
import static org.junit.Assert.*;
public class Test1{
    @Test
    public void pindalaTest1(){
        NelinurkPindalaLiides yl=new NelinurkPindalaValem();
        assertEquals(6, yl.leiaPindala(3, 3));
    }
	
	@Test
    public void pindalaTest2(){
        NelinurkPindalaLiides yl=new NelinurkPindalaValem();
		assertEquals(16, yl.leiaPindala(4, 4));
    }
	
	@Test
    public void pindalaTest3(){
        NelinurkPindalaLiides yl=new NelinurkPindalaValem();
		assertEquals(20, yl.leiaPindala(5, 5));
    }
	
	@Test
    public void pindalaTest4(){
        NelinurkPindalaLiides yl=new NelinurkPindalaValem();
		assertEquals(1, yl.leiaPindala(1, 1));
    }
	
	@Test
    public void pindalaTest5(){
        NelinurkPindalaLiides yl=new NelinurkPindalaValem();
		assertEquals(100, yl.leiaPindala(10, 10));
    }
}
//Tests run: 5, Failures: 2, Errors: 0, Skipped: 0, Time elapsed: 0.116 sec <<< FAILURE!
//pindalaTest1(NelinurkPindala.Test1)  Time elapsed: 0.01 sec  <<< FAILURE!
//pindalaTest3(NelinurkPindala.Test1)  Time elapsed: 0 sec  <<< FAILURE!