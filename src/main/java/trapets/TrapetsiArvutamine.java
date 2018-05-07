package trapets;
public class TrapetsiArvutamine implements TrapetsiArvutamineLiides{
	@Override
	public double arvutamine(double alus1, double alus2, double kõrgus){
		double vastus = (alus1 + alus2)/2 *kõrgus;
		return vastus;
	}
}
	