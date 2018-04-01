package generaator;
public class ParooliTavalineLooja implements LiitmisylesanneteLoojaLiides{
     @Override
     public String looParool(String esimenesona, String teinesona, String symbol, int number){
			FailistLugemiseLiides generaator=new SuvaliseArvuGeneraator();
			String esimenesona = sonadelist.get(looSuvalineArv(0, 7));
			String teinesona = sonadelist.get(looSuvalineArv(0, 7));
			String symbol = symbolitelist.get(looSuvalineArv(0, 9));
			int number = looSuvalineArv(0, 50);
			return new (looParool(esimenesona, teinesona, symbol, number));
     }
}