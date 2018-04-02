package pranglimine;
public class RistkylikuPindala{
    int kylg1;
    int kylg2;
    int vastus;
    public RistkylikuPindala(int a, int b){
        kylg1=a;
        kylg2=b;
        vastus=kylg1*kylg2;
    }
    @Override
    public String toString(){
        return kylg1+"*"+kylg2+"=";
    }
    public int kysiVastus(){
        return vastus;
    }
    public int kysiKylg1(){
        return kylg1;
    }
    public int kysiKylg2(){
        return kylg2;
    }
}