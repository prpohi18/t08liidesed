package kodutoo8;
public class KorrutamisylesanneteTavalineLooja implements KorrutamisYlesanneteLoojaLiides{
	@Override
	public KorrutamisYlesanne looKorrutamisYlesanne(int maxkorrutis){
		JuhuarvudeGeneraatoriLiides generaator=new JuhuarvudeYhtlaneGeneraator();
		int a1=generaator.looJuhuarv(50, 100);
		int a2=generaator.looJuhuarv(0, 50);
		int a3=a1-a2;
		return new KorrutamisYlesanne(a3, a2);
	}
}
