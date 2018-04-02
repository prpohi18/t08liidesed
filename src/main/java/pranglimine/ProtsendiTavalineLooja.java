package pranglimine;
public class ProtsendiTavalineLooja implements ProtsendiLoojaLiides{
     @Override
     public Protsendiylesanne looProtsendiylesanne(int maxVisked){
         JuhuarvudeGeneraatoriLiides generaator=new JuhuarvudeYhtlaneGeneraator();
         int visked =generaator.looJuhuarv(0, maxVisked);
         int tabamised=generaator.looJuhuarv(0, visked);
         return new Protsendiylesanne(visked, tabamised);
     }
}