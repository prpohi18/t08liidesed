package kodutoo8;
public class KorrutamisYlesanne{
	int kordaja1;
	int kordaja2;
	int korrutis;
	public KorrutamisYlesanne(int arv1, int arv2){
		kordaja1=arv1;
		kordaja2=arv2;
		korrutis=kordaja1*kordaja2;
	}
	@Override
	public String toString(){
		return kordaja1+" X "+kordaja2+" = ";
	}
	public int kysiKorrutis(){
		return korrutis;
	}
	public int kysiKordaja1(){
		return kordaja1;
	}
	public int kysiKordaja2(){
		return kordaja2;
	}
}