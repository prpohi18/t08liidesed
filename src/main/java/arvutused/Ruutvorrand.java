package arvutused;
import java.util.*;
public class Ruutvorrand implements RuutvorrandiLiides{
    @Override
    public double diskriminant(double a, double b, double c){
        double diskr = (Math.pow(b, 2)) - (4 * a * c);
        return diskr;
    }
    @Override
    public double ruutvorrand1(double a, double b, double c, double diskr){
        double x1 = (-b + (Math.sqrt(diskriminant(a, b, c))))/(2 * a);
        return x1;
    }

    @Override
    public double ruutvorrand2(double a, double b, double c, double diskr){
        double x2 = (-b - (Math.sqrt(diskriminant(a, b, c))))/(2 * a);
        return x2;
    }
}
