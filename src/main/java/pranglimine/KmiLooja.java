package pranglimine;
public class KmiLooja implements KmiLoojaLiides{
     @Override
     public Kmiylesanne looKmiylesanne(float maxsumma){
         JuhuarvudeGeneraatorLiides generaator=new JuhuarvudeYhtlaneGeneraator();
         float kaal=generaator.looJuhuarv(65, 70);
         float pikkus=generaator.looJuhuarv(165, 175);
         return new Kmiylesanne(pikkus, kaal);
     }
}