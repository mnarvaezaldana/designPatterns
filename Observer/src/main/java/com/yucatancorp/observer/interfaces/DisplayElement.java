package com.yucatancorp.observer.interfaces;

public interface DisplayElement {

    /**
     * Third step:
     *
     *  This interface is created in order to demonstrate that other interfaces could be added to the
     *  object which implements Observer interface.
     *
     *  With this interface implemented in all the observers, the method display could also be called
     *  iterating over the observers list.
     *
     *  For the fourth step go to WeatherData which implements the Subject interface.
     */

    void display();
}
