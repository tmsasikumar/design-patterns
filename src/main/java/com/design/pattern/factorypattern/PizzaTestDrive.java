package com.design.pattern.factorypattern;


import com.design.pattern.simplefactory.Pizza;

public  class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nypizzaStore = new NyStylePizzaStore();
        PizzaStore chicagopizzaStore = new ChicagoStylePizzaStore();
        nypizzaStore.orderPiza("Cheese");
        chicagopizzaStore.orderPiza("Cheese");
    }
}

