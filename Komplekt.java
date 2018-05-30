package astendamine;
import java.util.*;
public class Komplekt implements VastusteKomplektiLiides{
  List<Astendamine> hoidla=new ArrayList<Astendamine>();
  public void lisaAstendamine(Astendamine ylesanne) {
    hoidla.add(ylesanne);
  }

  public String vastusTekstina() {
    StringBuilder sb=new StringBuilder();
    boolean alustatud=false;
    for(Astendamine y: hoidla) {
      if(alustatud){sb.append("\n");}
      sb.append(y);
      alustatud=true;
    }
    return sb.toString();
  }
}