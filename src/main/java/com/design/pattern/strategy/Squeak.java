package com.design.pattern.strategy;


public class Squeak implements  QuackBehavior{

    @Override
    public void quack() {
        System.out.println("I cant Quack. I can squeak.");
    }
}

