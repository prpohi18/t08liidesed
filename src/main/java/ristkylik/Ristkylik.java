package ristkylik;

public class Ristkylik {
    int a, b, s, p;
    public Ristkylik(int pikkus, int laius){
        a = pikkus;
        b = laius;
        s = a*b;
        p = 2*(a + b);

    }

    @Override
    public String toString(){
        return "Ristküliku pindala on "+s+" ja ümbermõõt "+p;

    }
    public int kysiPindala() {
        return s;
    }

    public int kysiYmbermoot(){
        return p;
    }
}
