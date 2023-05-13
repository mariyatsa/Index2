

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height;
        height = (Math.pow(1.87, 2));
        int weight = 98;
        int index = (int) service.calculate(height, weight);
        System.out.println(index);
    }
}