package pranglimine;
public class Lahutamisylesanne{
    int lahutatav1;
    int lahutatav2;
    int summa;
    public Lahutamisylesanne(int arv1, int arv2){
        lahutatav1=arv1;
        lahutatav2=arv2;
        summa=lahutatav1-lahutatav2;
    }
    @Override
    public String toString(){
        return lahutatav1+"-"+lahutatav2+"=";
    }
    public int kysiSumma(){
        return summa;
    }
    public int kysiLahutatav1(){
        return lahutatav1;
    }
    public int kysiLahutatav2(){
        return lahutatav2;
    }
}