package liidesed.kaur;

public class kolmnurgaPindala implements kolmnurgaPindalaLiides{
    
    @Override
    public double pindala(double a, double h){
		double S = (a * h)/2;
        return S;
    }
} 

