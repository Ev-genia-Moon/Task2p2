
public class Main {
    public static void main(String[] args) {

        int nbalance=50; //начальный баланс
        int sum=1100; //сумма пополнения
        int bonus; // бонус
        int kbalance; //конечный баланс

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        if (sum>1000) {
            bonus=sum/100;
        } else {
            bonus=0;
        }
        kbalance=nbalance+sum+bonus;

        System.out.println("Количество начисленных бонусов:");
        System.out.println(bonus+" миль");
        System.out.println("Конечный баланс счета:");
        System.out.println(kbalance+" рублей");
        
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
