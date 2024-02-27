public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double meter = 1.83;
        int kilogram = 78;

        int index = service.calculate(meter, kilogram);
        System.out.println(index);
    }
}
