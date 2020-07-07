package com.design.pattern.java_observable;

import com.design.pattern.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements   DisplayElement, Observer {
    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Notification received to current conditions display");
        System.out.println("Current conditions temp "+ temperature + "Humidity:" + humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
       if(o instanceof WeatherData){
         this.temperature =  ((WeatherData) o).getTemperature();
         this.humidity = ((WeatherData) o).getHumidity();
         display();
       }
    }
}
