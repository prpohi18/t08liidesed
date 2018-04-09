package nnPyraRuumala;
import java.lang.Math;
public class nnPyraRuumalaLeidmine implements nnPyraRuumalaLiides{
    @Override
    public double ruumala(double pserv, double korgus){
		double V = 1.0/3.0 * Math.pow(pserv, 2) * korgus;
        return V;
    }
} 