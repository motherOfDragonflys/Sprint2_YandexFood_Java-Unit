import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.GREEN_APPLE;
import static model.constants.Colour.RED_APPLE;

public class Main {
    public static void main(String[] args) {

        Food meat = new Meat(5, 100.00);
        Food redApple = new Apple(10, 50.0, RED_APPLE);
        Food greenApple = new Apple(8, 60.0, GREEN_APPLE);

        Food[] products = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(products);

        double totalWithoutDiscount = shoppingCart.totalWithoutDiscount();
        double totalWithDiscount = shoppingCart.totalWithDiscount();
        double totalVegetarianWithoutDiscount = shoppingCart.totalVegetarianWithoutDiscount();

        System.out.printf("Общая сумма товаров в корзине без скидки: %.2f руб. %n", totalWithoutDiscount);
        System.out.printf("Общая сумма товаров в корзине со скидкой: %.2f руб. %n", totalWithDiscount);
        System.out.printf("Общая сумма всех вегетарианских продуктов в корзине без скидки: %.2f руб. %n", totalVegetarianWithoutDiscount);
    }
}
/* ИСПРАВЛЕНО:
- формулы корректные, были другие исходные значения в объектах яблок в Main
(проверяла работоспособность формул, забыла вернуть к данным из задания...)
- применен printf
*/