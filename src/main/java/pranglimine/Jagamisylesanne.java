package pranglimine;
public class Jagamisylesanne{
    int jagatav1;
    int jagatav2;
    int summa;
    public Jagamisylesanne(int arv1, int arv2){
        jagatav1=arv1;
        jagatav2=arv2;
        summa=jagatav1/jagatav2;
    }
    @Override
    public String toString(){
        return jagatav1+"/"+jagatav2+"=";
    }
    public int kysiSumma(){
        return summa;
    }
    public int kysiJagatav1(){
        return jagatav1;
    }
    public int kysiJagatav2(){
        return jagatav2;
    }
}