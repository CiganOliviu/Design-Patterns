package com.BebiSoft.Builder;

public class F16Builder extends AircraftBuilder {

    @Override
    public void buildEngine() {
        System.out.println("Engine build for F16");
    }

    @Override
    public void buildWings() {
        System.out.println("Wings build for F16");
    }

    @Override
    public void buildCockpit() {
        System.out.println("Cockpit build for F16");
    }
}
