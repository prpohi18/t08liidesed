package pyramiid;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid {

  @Test
  public void pyramiidKontroll(){
      Pyramiid p1=new Pyramiid(2, 3, 4, 2);
      Pyramiid p2=new Pyramiid(3, 2, 1, 2);
      assertEquals(12, p1.kysiPindala());
      assertEquals(8, p1.kysiRuumala());
      assertEquals(3, p2.kysiPindala());
      assertEquals(2, p2.kysiRuumala());
  }

  @Test
  public void vastusteKomplektiLoomine() {
    VastusteKomplektiLiides komplekt = new Komplekt();
    komplekt.lisaPyramiid(new Pyramiid(3, 2, 1, 2));
    komplekt.lisaPyramiid(new Pyramiid(4, 6, 2, 2));
  }
}