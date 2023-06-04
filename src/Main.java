public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 13676; // Стоимость билета
        int miles = service.calculate(price);

        System.out.println("Количество начисленных миль: ");
        System.out.println((miles) + " бонусных(е) миль(и)");
    }
}
