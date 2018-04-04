
package ee.tlu.ttaevik.liidesed;
import org.junit.*;
import static org.junit.Assert.*;


public class TeisendusTest {
    
    Teisendused test= new Teisendused();
    
    @Test
    public void CelToFahr(){
        assertEquals(35.6, test.CelsiusToFahrenheit(2.0), 0.1);
    }
    
    @Test
    public void KelToCel(){
        assertEquals(-271.16, test.KelvinToCelsius(2.0), 0.1);
    
    }
    
/*
     T E S T S
-------------------------------------------------------
Running ee.tlu.ttaevik.liidesed.TeisendusTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.072 sec

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
    */    
}
