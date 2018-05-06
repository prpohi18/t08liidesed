package ylesanne;
public class Ajaylesanne{
	double aeg;
	int teepikkus;
	int kiirus;
	public Ajaylesanne(int teepikkus1, int kiirus1){
		teepikkus=teepikkus1;
		kiirus=kiirus1;
		aeg=teepikkus/kiirus;
	}
	@Override
	public String toString(){
		return teepikkus+"/"+kiirus+"=";
	}
	public double kysiTeepikkus(){
		return teepikkus;
	}		
	public double kysiKiirus(){
		return kiirus;
	}
	public double kysiAeg(){
		return aeg;
	}
}