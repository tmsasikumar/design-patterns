package com.design.pattern.templatemethod;

public abstract class CafeeineBeverage {

    public final void prepareReceipe(){

        boilWater();

        brew();

        pourinCup();

        if(customerNeedsCondinment()) {
            addCondinments();
        }
        
    }

     boolean customerNeedsCondinment() {
        return true;

    }

    private void pourinCup() {
        System.out.println("Pour beverage in cup;");
    }


    protected abstract void addCondinments();

    protected abstract void brew();

    private void boilWater() {

        System.out.println("boiling water");
    }
}
