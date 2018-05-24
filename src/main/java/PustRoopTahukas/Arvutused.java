package PustRoopTahukas;

public class Arvutused implements Liides{
	@Override
	public double pindala(double kulg1, double kulg2, double korgus){
			double Ppindala = (kulg1 + kulg2)* 2;
			double Kpindala = ((kulg1 * 2) + (kulg2 * 2)) * korgus;
			double Tpindala = Kpindala + (2 * Ppindala);
			
			return Tpindala;
	}

	public double ruumala(double kulg1, double kulg2, double korgus){
		double Ppindala = (kulg1 + kulg2)* 2;
		double Ruumala = Ppindala * korgus;

		return Ruumala;

	}
}