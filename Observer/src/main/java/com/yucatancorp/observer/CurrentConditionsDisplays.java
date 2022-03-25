package com.yucatancorp.observer;

public class CurrentConditionsDisplays implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplays(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("The value for temperature is: " + temperature);
        System.out.println("The value for humidity is: " + humidity);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
