package com.design.pattern.templatemethod;

public class Tea extends CafeeineBeverage {


    @Override
    protected void addCondinments() {
        System.out.println("Add lemon");
    }

    @Override
    protected void brew() {

        System.out.println("brewing tea");
    }
}
