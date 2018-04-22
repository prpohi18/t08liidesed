package pranglimine;

public class RistkylikuPindala implements RistkylikuLiides{
    int a;
    int b;
    float vastus;
    @Override
    public float arvutaRistkylikuPindala(int algus, int lopp){
        JuhuarvudeGeneraatoriLiides generaator=new JuhuarvudeYhtlaneGeneraator();
        a=generaator.looJuhuarv(algus, lopp);
        b=generaator.looJuhuarv(algus, lopp);
        vastus = (a*b);
        return vastus;
    }
    public float kysiVastus(){
        return vastus;
    }
    public float kysiEsimeneKylg(){
        return a;
    }
    public float kysiTeineKylg(){
        return b;
    }
}
