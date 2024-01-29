package Decorator_Pattern.ToppingDecorator;

import Decorator_Pattern.Pizza.Base_Pizza;

public class Mushrooms extends Topping_Decorator{
    Base_Pizza obj;
    public Mushrooms(Base_Pizza obj){
        this.obj = obj;
    }

    public int cost(){
        return this.obj.cost() + 20;
    }
}
