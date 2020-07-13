package com.design.pattern.factorypattern;

public class NyStyleCheesePizza extends com.design.pattern.simplefactory.Pizza {

    public NyStyleCheesePizza(){
        name = "Ny Style Sauce and Cheese pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara sauce";
        toppings.add("Grated Ragganio cheese");
    }
}
