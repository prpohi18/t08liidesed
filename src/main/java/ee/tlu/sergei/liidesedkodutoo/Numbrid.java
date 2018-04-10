package ee.tlu.sergei.liidesedkodutoo;

public class Numbrid implements NumbridLiides{


    @Override
    public double kronKesk(double[] b){
        int jag = 0;
        double sum = 0;
        for (int i = 0; i < b.length; i++) {
            jag++;
        }
        jag = jag - 1;
        sum = arraySum(b) - b[0] - b[b.length-1];
        return (b[0]/2 + sum +b[b.length-1]/2)/jag;
     }
    
    @Override
    public double arraySum(double[] a){
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum+a[i];   
        }
        return sum;
    }
    
    
   
     
     
    
}