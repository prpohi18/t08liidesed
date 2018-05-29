package kaheksas;
public class Arvutused implements Arvud{

    @Override
    public double pindala(int a, int h) {
        return a * h / 2;
    }

    @Override
    public double umbermoot(int a, int b, int c) {
        return a + b + c;
    }
}