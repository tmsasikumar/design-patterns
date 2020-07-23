package com.design.pattern.templatemethod;

public class BeverageTestDrive {


    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareReceipe();

        Coffee coffee = new Coffee();
        coffee.prepareReceipe();
    }
}
