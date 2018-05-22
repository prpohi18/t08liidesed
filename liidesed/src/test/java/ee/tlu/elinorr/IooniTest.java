package ee.tlu.elinorr;
import ee.tlu.elinorr.liidesed.Ioon;
import org.junit.Test;
import static org.junit.Assert.*;

public class IooniTest {
    
    public IooniTest() {
    }
    @Test
    public void loomine(){
        Ioon i1 = new Ioon("H+", 1, 1);
        Ioon i2 = new Ioon ("NO3-", 3, -1);
        
        assertEquals(1, i1.kysiLaeng());
        assertEquals(3, i2.kysiAatommass());
    }
    
}

/*
Running ee.tlu.elinorr.IooniTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.073 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
*/
