package Decorator_Pattern.ToppingDecorator;

import Decorator_Pattern.Pizza.Base_Pizza;

public class Extra_Cheese extends Topping_Decorator{

    Base_Pizza obj;
    public Extra_Cheese(Base_Pizza obj){
        this.obj = obj;
    }

    public int cost(){
        return this.obj.cost() + 15;
    }
}

// Base_Pizza a = new Extra_Cheese(New Farmhouse_Pizza()));