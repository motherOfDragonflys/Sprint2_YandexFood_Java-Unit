package model;

import static model.constants.Colour.RED_APPLE;
import static model.constants.Discount.FOR_GREEN_APPLE;
import static model.constants.Discount.FOR_RED_APPLE;

public class Apple extends Food implements Discountable {
    private final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true); //вегетарианский продукт, вызов родительского конструктора
        this.colour = colour; //принятие парметра конструктора полем colour текущего класса
    }

    @Override
    public double getDiscount() { //реализуется метод из интерфейса
        return RED_APPLE.equals(this.colour) ? FOR_RED_APPLE : FOR_GREEN_APPLE; //если яблоко красное, вернет скидку
    }

    public String getColour() { //чтобы читать цвет в ShoppingCart
        return colour;
    }
}
/* ИСПРАВЛЕНО:
- if-else заменен на тернарный оператор, спасибо - код стал удобнее
- применена скидка FOR_GREEN_APPLE вместо постоянного 0.0 (значение менять в Discount.java)
*/