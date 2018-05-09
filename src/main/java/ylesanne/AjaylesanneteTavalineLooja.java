package ylesanne;
public class AjaylesanneteTavalineLooja implements AjaylesanneteLoojaLiides{
	@Override
	public Ajaylesanne looAjaylesanne(int maxsumma){
		JuhuarvudeGeneraatoriliides generaator=new JuhuarvudeYhtlaneGeneraator();
		int a1=generaator.looJuhuarv(6, 11);
		int a2=generaator.looJuhuarv(1, 6);
		int a3=a1-a2;
		return new Ajaylesanne(a3, a2);
	}
}