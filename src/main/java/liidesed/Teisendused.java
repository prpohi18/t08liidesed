
package liidesed;


public class Teisendused implements TeisendusLiides{

    @Override
    public double EurToUsd(double eur) {
         double usd = eur*1.18;
         return usd;
        
    }

    @Override
    public double UsdToEur(double usd) {
        double eur = usd*0.85;
        return eur;
        
        
    }
    
    
}
