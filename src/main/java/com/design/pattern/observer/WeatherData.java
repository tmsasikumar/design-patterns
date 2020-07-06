package com.design.pattern.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private float temperature;
    private float humidity;
    private float pressure;
    private ArrayList<Observer> observers;

    public WeatherData(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        int index = this.observers.indexOf(o);
        if(index >= 0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
       for(Observer observer : observers){
           observer.update(temperature, humidity, pressure);
       }
    }



    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged() {
        notifyObserver();
    }
}
