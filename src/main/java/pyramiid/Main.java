package pyramiid;
public class Main {
  public static void main(String[] args) {
    VastusteKomplektiLiides komplekt=new Komplekt();
    komplekt.lisaPyramiid(new Pyramiid(3, 2, 1, 2));
    komplekt.lisaPyramiid(new Pyramiid(2, 3, 4, 3));
    komplekt.lisaPyramiid(new Pyramiid(3, 2, 4, 1));
    komplekt.lisaPyramiid(new Pyramiid(4, 3, 1, 2));
    System.out.println(komplekt.vastusTekstina());
  }
}

/*
  Kertus-MBP:t08liidesed kertu$ java -cp target/classes pyramiid.Main
  Püramiidi pindala on 3 ja ruumala 2
  Püramiidi pindala on 12 ja ruumala 12
  Püramiidi pindala on 12 ja ruumala 4
  Püramiidi pindala on 6 ja ruumala 4
  Kertus-MBP:t08liidesed kertu$ 
*/
