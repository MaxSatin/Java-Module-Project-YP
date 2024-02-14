import java.util.ArrayList;
import java.util.Scanner;
public class Calculator {

    ArrayList<Products> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    double sum = 0.0;

    public void prodCount() {
        while (true) {
            System.out.println("Уточните название продукта: ");
            String name = scanner.next();

            System.out.println("Уточние стоимость продукта: ");
            double price = scanner.nextDouble();

            Products productNew = new Products(name, price);
            productList.add(productNew);

            System.out.println("Продукт " + productNew.name + "стоимостью "
                    + productNew.price + "добавлен в список.\n Общая сумма составляет: "
                    + (sum += productNew.price));
            System.out.println("\nЧтобы ввести новый товар введите любой символ или слово.\n" +
                    "Чтобы закончить, введите 'Завершить'");

            if (scanner.next().equals.IgnoreCase("Завершить")) {
                break;
            }
        }
    }
}
