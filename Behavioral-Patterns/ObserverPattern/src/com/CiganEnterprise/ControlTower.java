package com.CiganEnterprise;

import java.util.ArrayList;
import java.util.Collection;

public class ControlTower implements ISubject {

    Collection<IObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {

    }

    @Override
    public void notifyObservers() {

        for (IObserver observer : observers) {
            observer.update(null);
        }
    }

    public void run() {

        while (true) {
            // get new runway/weather conditions and update observers
            // every five minutes
            // Thread.sleep(1000 * 60 * 5)
            notifyObservers();
        }
    }
}
