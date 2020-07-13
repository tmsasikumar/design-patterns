package com.design.pattern.factorypattern;


import com.design.pattern.simplefactory.Pizza;

public  class ChicagoStylePizzaStore extends PizzaStore {
    private Pizza pizza;


    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("Cheese")){
            pizza = new ChicagoStyleCheesePizza();
        }

        return pizza;
    }
}

