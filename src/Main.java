
public class Main {
    public static void main(String[] args) {

        int InitialBalance = 50; //начальный баланс
        int Deposit = 1100; //сумма пополнения
        int Bonus; // бонус
        int FinalBalance; //конечный баланс

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        if (Deposit > 1000) {
            Bonus = Deposit / 100;
        } else {
            Bonus = 0;
        }
        FinalBalance = InitialBalance + Deposit + Bonus;

        System.out.println("Количество начисленных бонусов:");
        System.out.println(Bonus + " миль");
        System.out.println("Конечный баланс счета:");
        System.out.println(FinalBalance + " рублей");

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
