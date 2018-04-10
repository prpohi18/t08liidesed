
package ee.tlu.sergei.liidesedkodutoo;

import org.junit.Test;
import static org.junit.Assert.*;


public class NumbridTest {
    Numbrid a = new Numbrid();
    public NumbridTest() {
        
    }
    @Test
    public void testKronKesk() {
        System.out.println("kronKesk");
        double[] b = {1,2,3,4,5,6};
        double expResult = 3.5;
        double result = a.kronKesk(b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testArraySum() {
        System.out.println("arraySum");
        double[] a2 = {1,2,3,4,5,6};
        double expResult = 1+2+3+4+5+6;
        double result = a.arraySum(a2);
        assertEquals(expResult, result, 0.0);
    }
    
}

/*
arraySum
kronKesk
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.089 sec

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
*/