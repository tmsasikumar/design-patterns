package com.design.pattern.simplefactory;

public class TestPizaStore {
    public static void main(String[] args) {

        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPiza("cheese");
    }
}
