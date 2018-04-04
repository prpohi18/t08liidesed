package liidesedkodus;
public class Koer implements ElusOlend{

    int vanus;
    String sugu;

    public Koer(int vanus, String sugu) {
        this.vanus = vanus;
        this.sugu = sugu;
    }
    
    
    @Override
    public int vanus() {
        return vanus;
    }

    @Override
    public String sugu() {
        return sugu;
    }

    @Override
    public boolean kasIsane() {
        if(sugu().equals("male")){
            return true;
        } else{
            return false;
        }
    }
    
}
