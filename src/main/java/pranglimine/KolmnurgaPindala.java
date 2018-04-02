package pranglimine;

public class KolmnurgaPindala implements KolmnurgaLiides{
    float vastus;
    @Override
    public float arvutaKolmnurgaPindala(int algus, int lopp){
        JuhuarvudeGeneraatoriLiides generaator=new JuhuarvudeYhtlaneGeneraator();
        int alus=generaator.looJuhuarv(algus, lopp);
        int korgus=generaator.looJuhuarv(algus, lopp);
        vastus = (alus*korgus)/2;
        return vastus;
    }
    public float kysiVastus(){
        return vastus;
    }
}