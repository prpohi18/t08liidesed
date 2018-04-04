package auto;

/**
 *
 * @author Sander
 */
public interface AutoI {
    public String getBrand();
    public String getColor();
    public String getLicensePlate();
    public void accelerate(int increment);
    public void brake(int decrement);
    
}
