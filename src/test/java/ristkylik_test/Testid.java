package ristkylik_test;
import org.junit.*;
import ristkylik.Komplekt;
import ristkylik.Ristkylik;
import ristkylik.VastusteKomplektiLiides;
import static org.junit.Assert.*;


public class Testid {

    @Test
    public void RistkylikuKontroll(){
        Ristkylik s1 = new Ristkylik(8, 4);
        Ristkylik p1 = new Ristkylik(9, 5);
        assertEquals(32, s1.kysiPindala());
        assertEquals(28, p1.kysiYmbermoot());
    }

    @Test
    public void vastusteKomplektiLoomine(){
        VastusteKomplektiLiides komplekt = new Komplekt();
        komplekt.lisaRistkylik(new Ristkylik(8, 4));
        komplekt.lisaRistkylik(new Ristkylik(10, 3));

    }
}
