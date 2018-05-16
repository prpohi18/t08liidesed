
package liidesed;
import org.junit.*;
import static org.junit.Assert.*;


public class TeisendusTest {
    
    Teisendused test= new Teisendused();
    
    @Test
    public void CelToFahr(){
        assertEquals(53.16, test.EurToUsd(45.0), 0.1);
    }
    
    @Test
    public void KelToCel(){
        assertEquals(21.16, test.UsdToEur(25.0), 0.1);
    
    }
    
/*
 T E S T S
-------------------------------------------------------
Running liidesed.TeisendusTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.068 sec

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

------------------------------------------------------------------------
BUILD SUCCESS
    */    
}
