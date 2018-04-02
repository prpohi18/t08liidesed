package pranglimine;
public class RistkylikuPindalaTavalineLooja implements RistkylikuPindalaLoojaLiides{
    @Override
    public RistkylikuPindala looRistkylikuPindala(int a, int b){
        return new RistkylikuPindala(a, b);
    }

}