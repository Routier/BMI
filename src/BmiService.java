public class BmiService {
    public int calculate(double height, double mass){
        return (int) (mass / Math.pow(height, 2));
    }
    
}
