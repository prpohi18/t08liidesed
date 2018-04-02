package pranglimine;
public class RuuduPindalaTavalineLooja implements RuuduPindalaLoojaLiides{
    @Override
    public RuuduPindala looRuuduPindala(int kyljePikkus){
        return new RuuduPindala(kyljePikkus);
    }

}