package ring;
import java.util.ArrayList;
import java.util.List;

public class Komplekt implements VastusteKomplektiLiides{
    List<ring> hoidla = new ArrayList<ring>();

    public void lisaRing(ring ylesanne) {
        hoidla.add(ylesanne);
    }

    public String vastusTekstina(){
        StringBuilder sb = new StringBuilder();
        boolean alustatud = false;
        for (ring y: hoidla){
            if (alustatud){
                sb.append("\n");
            }
            sb.append(y);
            alustatud = true;
        }
        return sb.toString();
    }
}
