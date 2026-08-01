package model;

public abstract class Food { //абстрактный

    protected int amount; //количество продукта в килограммах (целое число)
    protected double price; //цена за единицу (вещественное число)
    protected boolean isVegetarian; //флаг, вегетарианский ли продукт
    //protected - поля доступны только для классов-потомков

    protected Food (int amount, double price) {
    //конструктор для Meat
        this.amount = amount;
        this.price = price;
        this.isVegetarian = false;
    }
    protected Food (int amount, double price, boolean isVegetarian) {
    //конструктор для Apple
        this.amount = amount;
        this.price = price;
        this.isVegetarian = true;
    }

    public double getPrice() { //для 1го метода в ShoppingCart
        return price;
    }

    public boolean isVegetarian() { //для 3го метода в ShoppingCart
        return isVegetarian;
    }

    public int getAmount() {
        return amount;
    }
}
