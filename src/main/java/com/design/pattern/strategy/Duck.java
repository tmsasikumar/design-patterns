package com.design.pattern.strategy;

public abstract class Duck {

     FlyBehavior flyable;
     QuackBehavior quackable;

    public void swim(){
       System.out.println("I am swimming");
    }

    public void performFly() {
        flyable.fly();
    }

    public void performQuack() {
        quackable.quack();
    }

    public void setFlyBehavior(FlyBehavior fb){
        this.flyable = fb;
    }


    public void setQuackBehavior(QuackBehavior qb){
        this.quackable = qb;
    }
    public abstract void display();
}
