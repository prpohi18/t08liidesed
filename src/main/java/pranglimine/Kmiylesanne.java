package pranglimine;
public class Kmiylesanne{
    float liidetav1;
    float liidetav2;
	double summa;
    public Kmiylesanne(float kaal, float pikkus){
        liidetav1=kaal;
        liidetav2=pikkus;
        summa=kaal/Math.pow(pikkus/100.0, 2);
    }

    public float kysiSumma(){
        return (float)summa;
    }
    public float kysiLiidetav1(){
        return liidetav1;
    }
    public float kysiLiidetav2(){
        return liidetav2;
    }
}