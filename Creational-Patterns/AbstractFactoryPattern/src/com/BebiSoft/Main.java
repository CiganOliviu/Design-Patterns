package com.BebiSoft;

import com.BebiSoft.Factory.Boeing747Factory;
import com.BebiSoft.Factory.F16Factory;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        F16Factory f16Factory = new F16Factory();
        Boeing747Factory boeing747Factory = new Boeing747Factory();

        Collection<Aircraft> myPlanes = new ArrayList<>();

        myPlanes.add(new Aircraft(f16Factory));
        myPlanes.add(new Aircraft(boeing747Factory));

        for (Aircraft aircraft : myPlanes)
            aircraft.fly();
    }
}
