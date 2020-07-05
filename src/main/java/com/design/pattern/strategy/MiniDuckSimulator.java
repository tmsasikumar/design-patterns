package com.design.pattern.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();;

        System.out.println("----------------");
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        
        rubberDuck.setFlyBehavior(new FlyWithWings());
        rubberDuck.performFly();
    }
}
