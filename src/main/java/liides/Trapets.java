package liides;
public class Trapets implements TrapetsLiides{
    @Override
    public double ymbermoot(int a, int b, int c, int d){
        return a + b + c + d;
    }

    @Override
    public double keskloik(int a, int b) {
        return (double)(a + b)/2;
    }

    @Override
    public double pindala(int a, int b, double korgus) {
        return korgus * keskloik(a, b);
    }
}
