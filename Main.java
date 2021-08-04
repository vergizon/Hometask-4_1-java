public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        long miles = service.calculate( 10150);
        System.out.println(miles);
    }
}