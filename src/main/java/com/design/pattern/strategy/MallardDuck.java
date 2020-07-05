package com.design.pattern.strategy;

public class MallardDuck extends Duck {

    public MallardDuck(){
        this.flyable = new FlyWithWings();
        this.quackable = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am mallard duck");
    }
}

