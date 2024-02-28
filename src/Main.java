
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = service.calculate(1.75, 62.5); // должно быть 20
        System.out.println(index);

        int index2= service.calculate(1.90,150.6); // должно быть 41
        System.out.println(index2);
    }
}