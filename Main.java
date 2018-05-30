package astendamine;
public class Main {
  public static void main(String[] args) {
    VastusteKomplektiLiides komplekt=new Komplekt();
    komplekt.lisaAstendamine(new Astendamine(3, 2));
    komplekt.lisaAstendamine(new Astendamine(2, 3));
    komplekt.lisaAstendamine(new Astendamine(4, 2));
    komplekt.lisaAstendamine(new Astendamine(4, 3));
    System.out.println(komplekt.vastusTekstina());
  }
}

/*
java -cp target/classes astendamine.Main

Tulemus on 9.0
Tulemus on 8.0
Tulemus on 16.0
Tulemus on 64.0
*/
