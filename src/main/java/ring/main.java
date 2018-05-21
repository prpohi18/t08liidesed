package ring;

public class main {
    public static void main(String[] args) {
        VastusteKomplektiLiides komplekt = new Komplekt();
        komplekt.lisaRing(new ring(5));
        komplekt.lisaRing(new ring(8));
        System.out.println(komplekt.vastusTekstina());
    }

}
