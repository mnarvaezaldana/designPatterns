package com.yucatancorp.observer;

public interface Observer {

    /**
     * First step:
     *
     *  Create the Observer interface and the method that is called when the subject is triggered
     *  by the desired behavior.
     *
     *  next step is to create the interface Subject
     */

    void update();
}
