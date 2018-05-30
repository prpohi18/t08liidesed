package astendamine;

import java.lang.Math;

public class Astendamine{
  double r, a, b;
  public Astendamine(double arv, double astendaja){
    a=arv;
    b=astendaja;
    r=Math.pow(a, b); 
  }

  @Override
  public String toString(){
    return "Tulemus on "+r;
  }
  public double kysiAstendamine(){
    return r;
  }
}