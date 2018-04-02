package kolmnurk;
public class KolmnurgaYlesanneteTavalineLooja implements KolmnurgaYlesanneteLoojaLiides{
	@Override
	public KolmnurgaYlesanne looKolmnurgaYlesanne(int maxpindala){
		int a1=3;
		int a2=2;
		return new KolmnurgaYlesanne(a1, a2);
	}
}