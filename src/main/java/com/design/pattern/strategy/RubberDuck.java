package com.design.pattern.strategy;

public class RubberDuck extends Duck {

    public RubberDuck(){
        this.flyable = new NoFly();
        this.quackable = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I am a rubber duck");
    }
}

