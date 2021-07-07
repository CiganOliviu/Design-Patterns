package com.CiganEnterprise;

import java.util.ArrayList;
import java.util.List;

public class ControlTower {

    List<IAircraft> airplanes = new ArrayList<>();

    synchronized public void requestToLand(IAircraft aircraft) {
        airplanes.add(aircraft);
    }

    public void run() {

        while (true) {

            while (airplanes.size() == 0);

            IAircraft aircraft;

            synchronized (this) {
                aircraft = airplanes.remove(0);
            }

            aircraft.land();
        }
    }
}
