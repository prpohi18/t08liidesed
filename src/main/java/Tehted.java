public class Tehted implements Liides {
    @Override
        public double aste (double alus, double astendaja) { //math pow teeb astenduse ara
        return  Math.pow(alus, astendaja);
    }

    @Override
    public int korrutis(int aste1, int aste2) {
        return aste1 * aste2;
    }
}
