package com.design.pattern.java_observable;

import com.design.pattern.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements   DisplayElement, Observer {
    private Observable observable;
    private float temperature;
    private float humidity;

    public StatisticsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Notification received to statistics display");
        System.out.println("Avg temp "+ temperature + "Humidity:" + humidity);
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
