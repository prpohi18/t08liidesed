package ristkylik;
import java.util.*;

public class Komplekt implements VastusteKomplektiLiides{
    List<Ristkylik> hoidla = new ArrayList<Ristkylik>();
    public void lisaRistkylik(Ristkylik ylesanne) {
        hoidla.add(ylesanne);
    }

    public String vastusTekstina(){
        StringBuilder sb = new StringBuilder();
        boolean alustatud = false;
        for (Ristkylik y: hoidla){
            if (alustatud){
                sb.append("\n");
            }
            sb.append(y);
            alustatud = true;
        }
        return sb.toString();
    }
}
