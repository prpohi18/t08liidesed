package pranglimine;
import org.junit.*;
import static org.junit.Assert.*;
public class Test1{
    @Test
    public void ylesandeLoomine(){
        Kmiylesanne yl=new Kmiylesanne(85, 200);
        assertEquals(21.25, yl.kysiSumma(), 0.5);
	}
}