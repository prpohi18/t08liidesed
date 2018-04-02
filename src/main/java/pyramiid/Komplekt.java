package pyramiid;
import java.util.*;
public class Komplekt implements VastusteKomplektiLiides{
  List<Pyramiid> hoidla=new ArrayList<Pyramiid>();
  public void lisaPyramiid(Pyramiid ylesanne) {
    hoidla.add(ylesanne);
  }

  public String vastusTekstina() {
    StringBuilder sb=new StringBuilder();
    boolean alustatud=false;
    for(Pyramiid y: hoidla) {
      if(alustatud){sb.append("\n");}
      sb.append(y);
      alustatud=true;
    }
    return sb.toString();
  }
}