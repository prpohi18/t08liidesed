package Ruut;
import java.util.*;

public class komplekt implements vastuseliides{
	List<ruut> hoidla=new ArrayList<ruut>();
	public void lisaRuut(ruut ylesanne) {
		hoidla.add(ylesanne);
	}

	public String vastusTekstina() {
		StringBuilder sb=new StringBuilder();
		boolean alustatud=false;
		for(ruut y: hoidla) {
		if(alustatud){sb.append("\n");}
		sb.append(y);
		alustatud=true;
		}
		return sb.toString();
	}
} 