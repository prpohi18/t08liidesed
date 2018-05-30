package kaheksa;
public class Arvutused implements ArvutusedLiides{
    @Override
    public double pyth(int kaatet1, int kaatet2){
        double hupotenuus = Math.round(Math.sqrt(Math.pow(kaatet1, 2) + Math.pow(kaatet2, 2)) * 1000D) / 1000D;
        return hupotenuus;
    }

    @Override
    public double pindala(int kaatet1, int kaatet2) {
        return kaatet1 * kaatet2 / 2;
    }

    @Override
    public double umbermoot(int kaatet1, int kaatet2, double hupotenuus) {
        return kaatet1 + kaatet2 + pyth(kaatet1, kaatet2);
    }
}