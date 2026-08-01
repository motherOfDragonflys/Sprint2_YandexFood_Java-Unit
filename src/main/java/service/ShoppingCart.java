package service;

import model.Apple;
import model.Food;
import model.constants.Colour;
import model.constants.Discount;


public class ShoppingCart {

    private Food[] names; //переменная-массив

    public ShoppingCart (Food[] names) { //создание объекта корзины
        this.names = names;
    }
//методы для суммы товаров в корзине:

    public double totalWithoutDiscount () { //без скидки
        double total = 0.0;
        for (Food name : names) {
            total += name.getPrice() * name.getAmount();
        }
    return total;
    }

    public double totalWithDiscount () { //со скидкой
        double total = 0.0;
        for (Food name : names) { //for-each
            double newPrice = name.getPrice();
            if (name instanceof Apple) {
                Apple apple = (Apple) name; //приведение к типу Apple
                if (Colour.RED_APPLE.equals(apple.getColour())) {
                    double discount = Discount.FOR_RED_APPLE;
                    newPrice = newPrice * (1 - discount / 100.00);
                }
            }
            total += newPrice * name.getAmount();
        }
        return total;
    }

    public double totalVegetarianWithoutDiscount () { //всех вегетарианских, без скидки
        double total = 0.0;
        for (Food name : names) {
            if (name.isVegetarian()) {
                total += name.getPrice() * name.getAmount();
            }
        } return total;
    }
}
