import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    ArrayList<Products> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    double sum;
    int divide;

    public void calcStart() {
        while (!scanner.hasNextInt()) {
            System.out.println("Введите, пожалуйста число");
            scanner.next();
        }
        divide = scanner.nextInt();
        while (true) {
            if (divide == 1) {
                System.out.println("Все оплатить придется самому");
                break;
            }
            if (divide > 1) {
                prodCount();
                break;
            }
            else {
                System.out.println("Вы ввели неправильное значение. Попробуйте снова!");
                while (!scanner.hasNextInt()) {
                    System.out.println("Введите, пожалуйста число");
                    scanner.next();
                }
                divide = scanner.nextInt();
            }
        }
    }

    public void prodCount() {
        while (true) {

            System.out.println("Уточните название продукта: ");
            String name = scanner.next();

            System.out.println("Уточните стоимость продукта: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Введите, пожалуйста число формате 1,45");
                scanner.next();
            }
            double price = scanner.nextDouble();

            Products productNew = new Products(name, price);
            productList.add(productNew);
            sum += productNew.price;

            System.out.println("Продукт " + productNew.name + " стоимостью "
                    + (Math.round(productNew.price * 100.0)/100.0) +
                    " " + formatter((Math.round(productNew.price * 100.0)/100.0))
                    + " добавлен в список.\nОбщая сумма составляет: "
                    + (Math.round((sum) * 100.0)/100.0) +
                    " " + formatter((Math.round((sum) * 100.0)/100.0)));

            System.out.println("\nЧтобы ввести новый товар введите любой символ.\n" +
                    "Чтобы закончить, введите 'Завершить'");

            if (scanner.next().equalsIgnoreCase("Завершить")) {
                finalSum();
                break;
            }
        }
    }

    public void finalSum(){
        System.out.println("\nДобавленные товары: ");
        for (Products product : productList)
            System.out.println (product.name + " " + (Math.round(product.price * 100.0)/100.0) +
                    " " + formatter ((Math.round(product.price * 100.0)/100.0)));

        System.out.println("Итоговая сумма: " + (Math.round(sum * 100.0)/100.0) +
                " " + formatter ((Math.round(sum * 100.0)/100.0)));

        int name = divide;
        double finalSum = sum / divide;
        System.out.println("Каждый должен оплатить: " + (Math.round(finalSum * 100.0)/100.0) +
                " " + formatter ((Math.round(finalSum * 100.0)/100.0)));
    }

    public String formatter (double number) {
        if ((number % 10) > 1 && (number % 10) < 5)
            return "рубля";

        else if ((number % 10) > 4 && (number % 10) < 10)
            return "рублей";

        else if ((number % 10) > 0 && (number % 10) < 2)
            return "рубль";

        else if ((number % 10) == 0)
            return "рублей";

        return null;
    }
    }