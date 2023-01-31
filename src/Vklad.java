import java.util.Scanner;

public class Vklad {
    public static void main(String[] args) {

        System.out.println("\t\t Введите имя:  ");
        String name = new Scanner(System.in).next();

        System.out.println("\t\t Введите желаемую сумму вклада: ");
        int start_money = new Scanner(System.in).nextInt();

        System.out.println("\t\t Укажите на сколько лет вы планируете открыть вклад: ");
        int years = new Scanner(System.in).nextInt();

        double rate = 0.05;
        double finish_money = start_money * (Math.pow(1 + rate, years));

        System.out.println("\t\t Приветствую," + name + "." + " Ваша окончательная сумма: " + finish_money);
    }
}
