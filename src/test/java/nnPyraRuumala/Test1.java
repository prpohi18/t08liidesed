package nnPyraRuumala;
import org.junit.*;
import static org.junit.Assert.*;
public class Test1{
    @Test
    public void ruumalaTest1(){
        nnPyraRuumalaLiides yl=new nnPyraRuumalaLeidmine();
        assertEquals(100.00, yl.ruumala(5.0, 12.0), 0.01);
    }
	
	@Test
    public void ruumalaTest2(){
        nnPyraRuumalaLiides yl=new nnPyraRuumalaLeidmine();
        assertEquals(35266.66, yl.ruumala(46.0, 50.0), 0.01);
    }
	
	@Test
    public void ruumalaTest3(){
        nnPyraRuumalaLiides yl=new nnPyraRuumalaLeidmine();
        assertEquals(17.42, yl.ruumala(3.3, 4.8), 0.01);
    }
	
	@Test
    public void ruumalaTest4(){
        nnPyraRuumalaLiides yl=new nnPyraRuumalaLeidmine();
        assertEquals(244.63, yl.ruumala(9.7, 7.8), 0.01);
    }
	
	@Test
	public void ruumalaTest5(){
        nnPyraRuumalaLiides yl=new nnPyraRuumalaLeidmine();
        assertEquals(13.55, yl.ruumala(2.2, 8.4), 0.01);
    }
} 