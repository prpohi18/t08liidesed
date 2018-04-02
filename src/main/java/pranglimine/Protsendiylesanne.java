package pranglimine;
public class Protsendiylesanne{
    int visked;
    int tabamised;
    int protsent;
    public Protsendiylesanne(int arv1, int arv2){
        visked=arv1;
        tabamised=arv2;
        protsent = (int) Math.round(tabamised*100.0/visked);
    }
    @Override
    public String toString(){
        return tabamised+"/"+visked+"=";
    }
    public int kysiProtsent(){
        return protsent;
    }
    public int kysiVisked(){
        return visked;
    }
    public int kysiTabamised(){
        return tabamised;
    }
}