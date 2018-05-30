package astendamine;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid {

  @Test
  public void pyramiidKontroll(){
      Astendamine a1=new Astendamine(2, 3);
      Astendamine a2=new Astendamine(3, 2);
      assertEquals(8, a1.kysiAstendamine(), 0.1);
      assertEquals(9, a2.kysiAstendamine(), 0.1);
  }

  @Test
  public void vastusteKomplektiLoomine() {
    VastusteKomplektiLiides komplekt = new Komplekt();
    komplekt.lisaAstendamine(new Astendamine(3, 2));
    komplekt.lisaAstendamine(new Astendamine(4, 6));
  }
}