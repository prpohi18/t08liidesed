package pranglimine;
public class LahutamisylesanneteTavalineLooja implements LahutamisylesanneteLoojaLiides{
    @Override
    public Lahutamisylesanne looLahutamisylesanne(int maxsumma){
        JuhuarvudeGeneraatoriLiides generaator=new JuhuarvudeYhtlaneGeneraator();
        int a1=generaator.looJuhuarv(5, 10);
        int a2=generaator.looJuhuarv(0, 5);
        int a3=a1-a2;
        return new Lahutamisylesanne(a3, a2);
    }
}