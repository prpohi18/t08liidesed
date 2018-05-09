package ylesanne;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid1{
	@Test
	public void ylesandeLoomine(){
		Ajaylesanne y1=new Ajaylesanne(8, 2);
		assertEquals("8/2=", y1.toString());
		assertEquals(4.0, y1.kysiAeg(), 0.1);
	}
	@Test
	public void ylesandeLoomineLiidesest(){
		AjaylesanneteLoojaLiides looja=new AjaylesanneteTavalineLooja();
		Ajaylesanne y1=looja.looAjaylesanne(100);
		assertTrue(y1.kysiAeg()<=100.0);
		assertEquals(y1.kysiAeg(), y1.kysiTeepikkus()/y1.kysiKiirus(), 0.1);
	}
	@Test
	public void juhuarvuLoomine(){
		JuhuarvudeGeneraatoriliides generaator=new JuhuarvudeYhtlaneGeneraator();
		boolean yksLeitud=false;
		boolean viisLeitud=false;
		for(int i=0; i<1000; i++){
			int arv=generaator.looJuhuarv(1, 5);
			assertTrue(arv>=1);
			assertTrue(arv<=5);
			if(arv==1){yksLeitud=true;}
			if(arv==5){viisLeitud=true;}
		}
		assertTrue(yksLeitud);
		assertTrue(viisLeitud);
	}
}