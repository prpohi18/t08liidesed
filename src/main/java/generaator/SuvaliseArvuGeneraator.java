package generaator;
public class SuvaliseArvuGeneraator implements FailistLugemiseLiides{
    @Override
    public int looSuvalineArv(int min, int max){
        return min+(int)(Math.random()*(max-min+1));
    }
}