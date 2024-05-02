//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

        int price2 = 15_000;
        int miles2 = service.calculate(price2);
        System.out.println(miles2);

        int price3 = 5_000;
        int miles3 = service.calculate(price3);
        System.out.println(miles3);

    }
}