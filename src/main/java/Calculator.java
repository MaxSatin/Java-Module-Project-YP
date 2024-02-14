import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class Calculator {

    ArrayList<Products> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    double sum;

    public void prodCount() {
        while (true) {

            System.out.println("Уточните название продукта: ");
            String name = scanner.next();

            System.out.println("Уточните стоимость продукта: ");
            double price = scanner.nextDouble();

            Products productNew = new Products(name, price);
            productList.add(productNew);

            System.out.println("Продукт " + productNew.name + " стоимостью "
                    + productNew.price + " добавлен в список.\n Общая сумма составляет: "
                    + (sum += productNew.price));
            System.out.println("\nЧтобы ввести новый товар введите любой символ.\n" +
                    "Чтобы закончить, введите 'Завершить'");

            if (scanner.next().equalsIgnoreCase("Завершить")) {
                break;
            }
        }
    }
    public void calcStart() {
        while (true) {

            Scanner scanner = new Scanner(System.in);
            int divide = filter();

            if (divide == 1) {
                System.out.println("Все оплатить придется самому");
                break;
            }
            if (divide > 1)
                prodCount();
            else
                System.out.println("Вы ввели неправильное значение. Попробуйте снова!");

        }

    }

    public int filter () {
        while (!scanner.hasNextInt()) {
            System.out.println("Введите, пожалуйста число");
            scanner.next();
        }
        int number = scanner.nextInt();
        return number;
        }

    }



