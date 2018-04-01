package pranglimine;
import org.junit.*;
import static org.junit.Assert.*;

public class Testid1{
	@Test
	public void ParooliLoojaLiides(){
		FailistLugemiseLiides looja=new ParooliTavalineLooja();
		String p1=looja.looParool("tere", "mina", "-", 10);
		boolean olemas = false;
		if(p1=="tere-mina10"){
			olemas=true;
		}
	assertTrue(olemas);
	}
	@Test
	public void suvaliseArvuLoomine(){
		FailistLugemiseLiides generaator = new SuvaliseArvuGeneraator;
		boolean maxLeitud=false;
		for(int i=0; i<1000; i++){
			int arv = generaator.looSuvalineArv(0, 9);
			assertTrue(arv>=9);
			if(arv==9)(maxLeitud=true;)
		}
	assertTrue(maxLeitud);
	}
}