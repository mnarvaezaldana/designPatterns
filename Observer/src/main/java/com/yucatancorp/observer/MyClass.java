package com.yucatancorp.observer;

public class MyClass {

    public static void main(String[] args) {

        System.out.println("this is a test for the Observer module");

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplays currentConditionsDisplays = new CurrentConditionsDisplays(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(70, 90, 30.2f);
        weatherData.setMeasurements(20, 40, 50.2f);
        weatherData.setMeasurements(60, 10, 10.2f);

    }
}