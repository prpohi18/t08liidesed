package Ruut;
public class Main {
  public static void main(String[] args) {
    vastuseliides komplekt=new komplekt();
    komplekt.lisaRuut(new ruut(4));
//    komplekt.lisaRuut(new ruut(8));

    System.out.println(komplekt.vastusTekstina());
  }
}