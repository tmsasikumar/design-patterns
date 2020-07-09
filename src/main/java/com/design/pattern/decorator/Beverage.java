package com.design.pattern.decorator;

public abstract class Beverage {

    String description = "Something";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
