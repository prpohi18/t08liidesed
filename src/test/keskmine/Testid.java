package pranglimine;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid1{
    @Test
    public void faktoriaaliKeskmine(){
        FaktoriaalideKeskmine fk=new looFakt(2, 3);
        assertEquals("2 ja 6 keskmine on 4" , fk.toString());
        assertEquals(4, fk.kysiKeskmine());
        assertEquals(2, fk.kysiFaktoriaal1())
        assertEquals(3, fk.kysiFaktoriaal2())
    }
}