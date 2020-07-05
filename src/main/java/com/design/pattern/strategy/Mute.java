package com.design.pattern.strategy;


public class Mute implements  QuackBehavior{

    @Override
    public void quack() {
        System.out.println("I cant Quack. I am mute");
    }
}

