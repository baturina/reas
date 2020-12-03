public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        service.calculate(20);
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}