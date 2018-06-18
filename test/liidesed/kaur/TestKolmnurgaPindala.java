package liidesed.kaur;

import org.junit.*;
import static org.junit.Assert.*;


public class TestKolmnurgaPindala{
    @Test
    public void pindalaTest1(){
        kolmnurgaPindalaLiides testing = new kolmnurgaPindala();
        assertEquals(3.00, testing.pindala(2.0, 3.0), 0.01);
    }

	@Test
    public void pindalaTest2(){
        kolmnurgaPindalaLiides testing = new kolmnurgaPindala();
        assertEquals(15, testing.pindala(6, 5), 0.01);
    }
	
	@Test
    public void pindalaTest3(){
        kolmnurgaPindalaLiides testing=new kolmnurgaPindala();
        assertEquals(16.875, testing.pindala(4.5, 7.5), 0.01);
    }
	
	@Test
    public void pindalaTest4(){
        kolmnurgaPindalaLiides testing=new kolmnurgaPindala();
        assertEquals(28044.00, testing.pindala(123, 456), 0.01);
    }
	
} 