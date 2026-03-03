import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5,100);
        Apple apple = new Apple(10, 50,"red");
        Apple apple1 = new Apple(8, 60, "green");

        Food [] products = {meat, apple, apple1};

        ShoppingCart cart = new ShoppingCart (products);

        System.out.println("Общая сумма без скидки: " + cart.totalWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + cart.totalWithDiscount());
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.vegetarianTotalWithoutDiscount());
    }
}