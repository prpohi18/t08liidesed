package kodutoo8;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid1{
	@Test
	public void YlesandeLoomine(){
		KorrutamisYlesanne yl=new KorrutamisYlesanne(3, 2);
		assertEquals("3 X 2 = ", yl.toString());
		assertEquals(6, yl.kysiKorrutis());
	}
	@Test
	public void ylesandeLoomineLiidesest(){
		KorrutamisYlesanneteLoojaLiides looja=new KorrutamisylesanneteTavalineLooja();
		KorrutamisYlesanne yl=looja.looKorrutamisYlesanne(100);
		assertTrue(yl.kysiKorrutis()<=100);
		assertEquals(yl.kysiKorrutis(), yl.kysiKordaja1()*yl.kysiKordaja2());
	}
	@Test
	public void juhuarvuLoomine(){
		JuhuarvudeGeneraatoriLiides generaator= new JuhuarvudeYhtlaneGeneraator();
		boolean yksLeitud=false;
		boolean viisLeitud=false;
		for(int i=0; i<1000;i++){
			int arv=generaator.looJuhuarv(1, 5);
			//System.out.println(arv);
			assertTrue(arv>=1);
			assertTrue(arv<=5);
			if(arv==1){yksLeitud=true;}
			if(arv==5){viisLeitud=true;}
		}
		assertTrue(yksLeitud);
		assertTrue(viisLeitud);
	}
}