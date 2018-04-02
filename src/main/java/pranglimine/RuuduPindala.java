package pranglimine;
public class RuuduPindala{
    int kylg1;
    int vastus;
    public RuuduPindala(int a){
        kylg1=a;
        vastus=kylg1*kylg1;
    }
    @Override
    public String toString(){
        return kylg1+"*"+kylg1+"=";
    }
    public int kysiVastus(){
        return vastus;
    }
    public int kysiKylg(){
        return kylg1;
    }

}