package pranglimine;
public class JuhuarvudeYhtlaneGeneraator implements JuhuarvudeGeneraatorLiides{
    @Override
    public int looJuhuarv(int min, int max){
        return min+(int)(Math.random()*(max-min+1));
    }
}