package com.design.pattern.templatemethod;

public class Coffee extends CafeeineBeverage {


    @Override
    protected void addCondinments() {
        System.out.println("Add Sugar");
    }

    @Override
    protected void brew() {

        System.out.println("brewing coffee");
    }

    public boolean customerNeedsCondinment() {
        return false;

    }
}
