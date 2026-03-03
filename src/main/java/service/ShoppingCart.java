package service;

import model.Food;

public class ShoppingCart {

    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double totalWithoutDiscount() {
        double total1 = 0;
        for (int i = 0; i < products.length; i++) {
            Food item = products[i];
            double sumForItem = item.getAmount() * item.getPrice();
            total1 = total1 + sumForItem;
        }
        return total1;
    }

    public double totalWithDiscount() {
        double total2 = 0;
        for (int i = 0; i < products.length; i++) {
            Food item = products[i];
            double sumForItemsDiscount = (item.getAmount() * item.getPrice() * (1 - item.getDiscount() / 100));
            total2 = total2 + sumForItemsDiscount;
        }
        return total2;
    }

    public double vegetarianTotalWithoutDiscount() {
        double total3 = 0;
        for (int i = 0; i < products.length; i++) {
            Food item = products[i];
            if (item.isVegetarian()) {
                double totalVegetarian = item.getAmount() * item.getPrice();
                total3 = total3+totalVegetarian;
            }
        }
        return total3;
    }
}