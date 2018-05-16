package keskmine;

public class FaktoriaalideKeskmine{
    int faktoriaal1;
    int faktoriaal2;
    int keskmine;

    public FaktoriaalideKeskmine(int arv1, int arv2){
        FaktLiides f1 = new Fakt();
        faktoriaal1 = f1.looFakt(arv1);
        faktoriaal2 = f1.looFakt(arv2);
        keskmine = (faktoriaal1 + faktoriaal2) / 2;
    }
    @Override
    public String toString(){
        return faktoriaal1 + " ja " + faktoriaal2 + " keskmine on " + keskmine;
    }
    public int kysiKeskmine(){
        return keskmine;
    }
    public int kysiFaktoriaal1(){
        return faktoriaal1;
    }
    public int kysiFaktoriaal2(){
        return faktoriaal2;
    }
}
