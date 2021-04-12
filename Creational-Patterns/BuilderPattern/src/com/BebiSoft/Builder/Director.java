package com.BebiSoft.Builder;

public class Director {

    AircraftBuilder aircraftBuilder;

    public Director(AircraftBuilder aircraftBuilder) {
        this.aircraftBuilder=  aircraftBuilder;
    }

    public void construct(boolean isPassenger) {
        aircraftBuilder.buildEngine();
        aircraftBuilder.buildCockpit();
        aircraftBuilder.buildWings();

        if (isPassenger)
            aircraftBuilder.buildBathroom();
    }
}
