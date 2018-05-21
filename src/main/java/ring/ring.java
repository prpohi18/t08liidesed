package ring;

public class ring {
    double s, p;
    int a;
    public ring(int raadius){
        a = raadius;
        double b = 3.14;
        s = (a*a)*(b);
        p = 2*a*b;

    }

    @Override
    public String toString(){
        return "Ringi pindala on "+s+" ja ümbermõõt "+p;

    }
    public double kysiPindala() {
        return s;
    }

    public double kysiYmbermoot(){
        return p;
    }
}
