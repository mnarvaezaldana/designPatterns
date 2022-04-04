package com.yucatancorp.observer.subject;

import com.yucatancorp.observer.interfaces.Observer;
import com.yucatancorp.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    /**
     * Fourth step:
     *
     *  This class implements the Subject interface therefore it has to implements the methods: registerObserver,
     *  removeObserver and notifyObservers.
     *
     *  This class has a list of observers which is initialized when the constructor of this class is called.
     *  This class also has three states: temperature, humidity and pressure. every state has its own getter.
     *
     *  registerObserver takes the object that implements the Observer interface and add it to the list of observers.
     *  removeObserver takes the object that implements the Observer interface and remove it from the list of observers.
     *  notifyObservers iterate over the observers list and called the method update (which is in the Observer interface)
     *
     *  measurementsChanged its called when the WeatherData object received (from setMeasurements) the notification of
     *  change, and it calls the notifyObservers method.
     *
     *  setMeasurements is called from outside in order to change the states and start the Observers-Subjects process.
     *
     *  For the fifth step go to the classes that implements Observer interface: CurrentConditionsDisplays,
     *  ForecastDisplay, StatisticsDisplay.
     */

    private final List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.update();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getPressure() {
        return this.pressure;
    }
}
