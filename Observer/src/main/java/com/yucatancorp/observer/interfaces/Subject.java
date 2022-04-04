package com.yucatancorp.observer.interfaces;

import com.yucatancorp.observer.interfaces.Observer;

public interface Subject {

    /**
     *
     * Second step:
     *
     *  The second step is to create an interface that the subject will implements and it has three
     *  methods: registerObserver which receive a Observer object (an object that implements Observer
     *  interface. It also has another method that is called "removeObserver" that received an object
     *  that implements also the Observer interface. And as well it has a method called notifyObservers
     *  which will trigger the behavior needed for every observer listed in the class that implements
     *  this interface.
     *
     * @param observer = is the object that implements the Observer interface and which is added or
     *                 removed (depends on the method called), from the list of observers that the class
     *                 which implements this interface has.
     *
     *  For third step go to DisplayElement interface
     */

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);


    void notifyObservers();
}
