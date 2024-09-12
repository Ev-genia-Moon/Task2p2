
public class Main {
    public static void main(String[] args) {

        int initialbalance = 50; //начальный баланс
        int deposit = 1100; //сумма пополнения
        int bonus; // бонус
        int finalbalance; //конечный баланс

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        finalbalance = initialbalance + deposit + bonus;

        System.out.println("Количество начисленных бонусов:");
        System.out.println(bonus + " миль");
        System.out.println("Конечный баланс счета:");
        System.out.println(finalbalance + " рублей");

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
