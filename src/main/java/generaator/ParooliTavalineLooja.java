package generaator;
public class ParooliTavalineLooja implements FailistLugemiseLiides{
	@Override
	  public int looSuvalineArv(int min, int max){
			return min+(int)(Math.random()*(max-min+1));
	  }
     @Override
     public String looParool(String esimenesona, String teinesona, String symbol, int number){
			esimenesona = esimenesona;
			teinesona = teinesona;
			symbol = symbol;
			//number = looSuvalineArv(0, 50);
			return (esimenesona+symbol+teinesona+number);
     }
  }
