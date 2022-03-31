package com.yucatancorp.observer;

public class CurrentConditionsDisplays implements Observer, DisplayElement {

    /**
     * Fifth step:
     *
     *  This class has two states: temperature and humidity, and also has an object WeatherData
     *  which implements the Subject interface (previously implemented).
     *
     *  This class implements the Observer and DisplayElement interface, so it has
     *  to implement display method (simple call to System.out.printl) and the update method.
     *
     *  The key ingredient here is at the constructor, that receives a WeatherData object (which implements
     *  the Subject interface), and called (at the constructor) the registerObserver method and pass this
     *  class (this observer) and is added to the WeatherData list of observers.
     *
     *  As this is an Observer the update method is called once in the WeatherData the iterate over the list
     *  method is called.
     *
     *  the display method is called on the update method.
     *
     *  For sixth step go to MyClass.
     */

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
