public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int result = service.calculate(317_000, 20);
            System.out.println(result);
    }
}
