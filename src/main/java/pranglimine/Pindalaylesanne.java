package pranglimine;
public class Pindalaylesanne{
    int kylg1;
    int kylg2;
    int pindala;
    public Pindalaylesanne(int arv1, int arv2){
        kylg1=arv1;
        kylg2=arv2;
        pindala=kylg1*kylg2;
    }
    @Override
    public String toString(){
        return kylg1+"*"+kylg2+"=";
    }
    public int kysiPindala(){
        return pindala;
    }
    public int kysiKylg1(){
        return kylg1;
    }
    public int kysiKylg2(){
        return kylg2;
    }
}