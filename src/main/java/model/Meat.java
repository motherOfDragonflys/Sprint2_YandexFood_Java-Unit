package model;

public class Meat extends Food{

    public Meat (int amount, double price) { //конструктор принимает количество и цену
        super(amount, price); //не вегетарианский продукт, вызов родительского конструктора
    }

}
