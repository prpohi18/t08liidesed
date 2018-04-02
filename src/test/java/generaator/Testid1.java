package generaator;
import org.junit.*;
import static org.junit.Assert.*;

public class Testid1{

		@Test
	public void ParooliLoojaLiides(){
		FailistLugemiseLiides looja=new ParooliTavalineLooja();
		String p1=looja.looParool("tere", "mina", "-", 10);
		boolean olemas = false;
                System.out.println(p1);
		if(p1.equals("tere-mina10")){
			olemas=true;
		}
	assertTrue(olemas);
	}
}