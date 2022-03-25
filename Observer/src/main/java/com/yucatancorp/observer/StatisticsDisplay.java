package com.yucatancorp.observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("The value for temperature is: " + temperature);
        System.out.println("The value for humidity is: " + humidity);
        System.out.println("The value for pressure is: " + pressure);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }
}
