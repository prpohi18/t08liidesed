package keskmine;
public class Fakt implements FaktLiides{
    @Override
    public int looFakt(int arv){
        int i,fakt=1;
        for(i=1;i<=arv;i++){    
            fakt=fakt*i;
        }
        return fakt;
    }
}