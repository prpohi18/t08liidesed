package kolmnurk;
public class KolmnurgaYlesanne{
	int kylg1;
	int korgus;
	int pindala;
	public KolmnurgaYlesanne(int arv1, int arv2){
		kylg1=arv1;
		korgus=arv2;
		pindala=(kylg1*korgus)/2;
	}
	
	public int kysiPindala(){
		return pindala;
	}
	public int kysiKylg1(){
		return kylg1;
	}
	public int kysiKorgus(){
		return korgus;
	}
}