package pyramiid;
public class Pyramiid{
  int k, a, n, h, s, v;
  public Pyramiid(int apoteem, int alus, int nurk, int kõrgus){
    k=apoteem;
    a=alus;
    n=nurk;
    h=kõrgus;
    s=k*a*n/2; 
    v=k*a*n*h/6;
  }

  @Override
  public String toString(){
    return "Püramiidi pindala on "+s+" ja ruumala "+v;
  }
  public int kysiPindala(){
    return s;
  }
  public int kysiRuumala(){
    return v;
  }
}