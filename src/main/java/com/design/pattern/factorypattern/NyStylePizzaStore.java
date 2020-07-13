package com.design.pattern.factorypattern;


import com.design.pattern.simplefactory.Pizza;

public  class NyStylePizzaStore extends PizzaStore {
    private Pizza pizza;


    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("Cheese")){
            pizza = new NyStyleCheesePizza();
        }
        else if(type.equals("Veggie")) {
            pizza = new NyStyleVeggiePizza();
        }

        return pizza;
    }
}

