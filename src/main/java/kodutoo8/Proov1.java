package kodutoo8;
public class Proov1{
	public static void main(String[] arg){
		KorrutamisYlesanne yl=new KorrutamisYlesanne(3, 2);
		System.out.println("Etteantud andmetega: 3 X 2 = "+yl.korrutis);
		
		KorrutamisYlesanneteLoojaLiides looja=new KorrutamisylesanneteTavalineLooja();
		KorrutamisYlesanne yl2=looja.looKorrutamisYlesanne(100);
		System.out.println("Juhuarvudel genereeritud: "+yl2.toString()+ yl2.korrutis);

	}
	}
