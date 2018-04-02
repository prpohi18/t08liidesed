
package com.mycompany.kodunetoo8;



public class Ruumala {

    
    public static int a;
    public static int b;
    public static int h;
    public Ruumala(int ka, int kb,int kh) {
        a=ka;
        b=kb;
        h=kh;
    }
    
    public static double Ruumala1(int a,int b, int h){
        return a * b * h;
    }
    

    public static double tulemus() {
        double V = Ruumala1(a,b,h);
                return V;
    }
    public static double Pindala(int a,int b, int h){
        return  2*((a * b) + (b * h) + (a * h));
        
    }
    public static double tulemus2() {
        double S = Pindala(a,b,h);
                return S;
    }
        
}
