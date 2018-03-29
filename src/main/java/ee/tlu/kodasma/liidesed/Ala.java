package ee.tlu.kodasma.liidesed;
import java.util.*;
class Ala {
    Kilpkonn k;
    char[][] m;
    List<AsukohagaObjekt> objektid=new ArrayList<>();
    
    Ala(int laius, int korgus) {
        k = new Kilpkonn(0, 0);
        objektid.add(k);
        m = new char[laius][korgus];
        for(int y = 0; y < m[0].length; y++) {
            for(int x = 0; x < m.length; x++) {
                m[x][y]= '.';
            }
        }
        m[k.kysiX()][k.kysiY()] = k.toString().charAt(0);
    }
    
    public boolean kasVaba(Koht koht) {
        return kasVaba(koht.kysiX(), koht.kysiY());
    }
    
    public boolean kasVaba(int x, int y) {
        if(x<0){return false;}
        if(y<0){return false;}
        if(x>=m.length){return false;}
        if(y>=m[0].length){return false;}
        for(AsukohagaObjekt obj: objektid){
            if(obj.kysiX()==x && obj.kysiY()==y){return false;}
        }
        return true;
    }
    
    Kivi p;
    public boolean lisaKivi(Kivi k) {
        if(kasVaba(k.kysiX(), k.kysiY())) {
            objektid.add(k);
            m[k.kysiX()][k.kysiY()]=k.toString().charAt(0);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int y = 0; y < m[0].length; y++) {
            for(int x = 0; x < m.length; x++) {
                sb.append(m[x][y]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public boolean k2sk(char korraldus) {
        int viga=-1;
        if (korraldus == 'e') {
            if(kasVaba(k.jargmineKoht())) {
                m[k.kysiX()][k.kysiY()] = '*';
                k.edasi();
                viga=0;
            } else {
                System.out.println("kinni");
                viga=1;
            }
        }
        if (korraldus == 'p') {
            k.keeraParemale();
            viga=0;
        }
        m[k.kysiX()][k.kysiY()] = k.toString().charAt(0);
        if(viga==-1){throw new RuntimeException("tundmatu kask");}
    }
    
    public void k2sud(String s) {
        for(int i = 0; i < s.length(); i++) {
            k2sk(s.charAt(i));
        }
    }
    
    public Kilpkonn kysiKilpkonn() {
        return k;
    }
}
