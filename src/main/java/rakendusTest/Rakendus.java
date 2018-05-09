package rakendusTest;

/**
 *
 * @author Hendrik
 */
    public class Rakendus implements rakendusLiidesed {
        @Override
        public double umbermoot(double a, double b){
            double umbermoot = 2 * (a + b);
            return umbermoot;
        }
     
        @Override
            public double pindala(double a, double b){
                double pindala = a * b;
                return pindala;
        }

}