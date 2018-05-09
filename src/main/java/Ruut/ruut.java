package Ruut;

public class ruut{
  int a, p, s;
  public ruut(int kyljepikkus){

    a=kyljepikkus;
	p=4*a;
	s=a*a;
	
  }

  @Override
  public String toString(){
    return "Ruudu ümbermõõt on "+p+" ja pindala on "+s;
  }
  public int kysiYmberm66t(){
    return p;
  }
  public int kysiPindala(){
    return s;
  }
} 