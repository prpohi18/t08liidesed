import java.io.File;
import java.util.Scanner;
import java.util.*;
package generaator;

public class FailistLugemine implements FailistLugemiseLiides{
  @Override
  public String looParool(String esimenesona, String teinesona, String symbol, int number){
	  return esimenesona+symbol+teinesona+number;
  }
  @Override
  public int looSuvalineArv(int min, int max){
        return min+(int)(Math.random()*(max-min+1));
  }
  public void main(String[] args) throws Exception {
    File sonadefail =
      new File("sonad/sonad.txt");
    Scanner loeSona = new Scanner(sonadefail);
	List<String> sonadelist = new ArrayList<String>();
 
    while (loeSona.hasNextLine())
	  sonadelist.add(loeSona.nextLine());
  
    File symbolitefail =
      new File("sonad/symbolid.txt");
    Scanner loeSymbol = new Scanner(symbolitefail);
	List<String> symbolitelist = new ArrayList<String>();
 
    while (loeSymbol.hasNextLine()){
	  symbolitelist.add(loeSymbol.nextLine());
    }
	String esimenesona = sonadelist.get(looSuvalineArv(0, 7));
	String teinesona = sonadelist.get(looSuvalineArv(0, 7));
	String symbol = symbolitelist.get(looSuvalineArv(0, 9));
	int number = looSuvalineArv(0, 50);
	System.out.println(looParool(esimenesona, teinesona, symbol, number));
  }

}