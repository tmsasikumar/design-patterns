package com.design.pattern.decorator;

public class StarBuzzCoffee  {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        Beverage darkRoastWithMocha = new Mocha(darkRoast);
        Beverage darkRoastWithMochaSoy = new Soy(darkRoastWithMocha);
        System.out.println(darkRoastWithMochaSoy.getDescription());
        System.out.println(darkRoastWithMochaSoy.cost());
    }

}
