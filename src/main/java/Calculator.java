import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class Calculator {

    ArrayList<Products> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    double sum = 0.00;

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
}
