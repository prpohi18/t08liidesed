
package ee.tlu.ttaevik.liidesed;


public class Teisendused implements TeisendusLiides{

    @Override
    public double CelsiusToFahrenheit(double celsius) {
         double fahrenheit = celsius*1.8+32;
         return fahrenheit;
        
    }

    @Override
    public double KelvinToCelsius(double kelvin) {
        double celsius = kelvin -273.15;
        return celsius;
        
        
    }
    
    
}
