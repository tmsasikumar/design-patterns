package com.design.pattern.factorypattern;

public class ChicagoStyleCheesePizza extends com.design.pattern.simplefactory.Pizza {

    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
