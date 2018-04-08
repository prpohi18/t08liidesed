package ristkylik;

public class Main {
    public static void main(String[] args) {
        VastusteKomplektiLiides komplekt = new Komplekt();
        komplekt.lisaRistkylik(new Ristkylik(8, 4));
        komplekt.lisaRistkylik(new Ristkylik(10,3));
        System.out.println(komplekt.vastusTekstina());
    }


    /*
    java -cp target/classes ristkylik.Main
    
    Ristküliku pindala on 32 ja ümbermõõt 24
    Ristküliku pindala on 30 ja ümbermõõt 26
     */
}
