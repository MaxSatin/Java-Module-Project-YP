
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator newCalc = new Calculator();
        System.out.println("Добрый день! На сколько человек будем делить счет?");

        while (true) {

            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNext("[A-Za-z]+")) {
                System.out.println("Nope, that's not it!");
                scanner.next();
            }
            int divide = scanner.nextInt();

            if (divide == 1) {
                System.out.println("Все оплатить придется вам");
                break;
            }
            if (divide > 1)
                newCalc.prodCount();
            else
                System.out.println("Вы ввели неправильное значение. Попробуйте снова!");

            }


        }
    }