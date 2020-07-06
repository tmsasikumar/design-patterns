package com.design.pattern.observer;

public class CurrentConditionDisplay implements  Observer, DisplayElement{
    private WeatherData weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Notification received to current conditions display");
        System.out.println("Current conditions temp "+ temperature + "Humidity:" + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
