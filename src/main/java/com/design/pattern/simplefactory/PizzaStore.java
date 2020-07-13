package com.design.pattern.simplefactory;

public class PizzaStore {

    private final SimplePizzaFactory factory;
    private Pizza pizza;

    public PizzaStore(SimplePizzaFactory pizzaFactory){
        this.factory = pizzaFactory;
    }

    public Pizza orderPiza(String type) {
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.cut();
        pizza.bake();
        pizza.box();
        return pizza;
    }
}


