package ylesanne;
public class JuhuarvudeYhtlaneGeneraator implements JuhuarvudeGeneraatoriliides{
	@Override
	public int looJuhuarv(int min, int max){
		return min+(int)(Math.random()*(max-min+1));
	}
}