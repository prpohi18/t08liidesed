import NewClass.NewClass;

public class Main implements NewClass {

    @Override
    public double power(double base, double exponent) {
        return Math.pow(base,exponent);
    }

    @Override
    public int product(int power1, int power2) {
        return power1*power2;
    }
}
