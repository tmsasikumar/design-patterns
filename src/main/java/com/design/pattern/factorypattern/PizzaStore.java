package com.design.pattern.factorypattern;


import com.design.pattern.simplefactory.Pizza;

public abstract class PizzaStore {
    private Pizza pizza;


    public Pizza orderPiza(String type) {
        pizza = createPizza(type);
        pizza.prepare();
        pizza.cut();
        pizza.bake();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}

