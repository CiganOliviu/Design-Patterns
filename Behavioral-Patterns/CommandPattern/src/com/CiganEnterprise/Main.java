package com.CiganEnterprise;

public class Main {

    public static void main(String[] args) {

        LandingGear landingGear = new LandingGear();

        ICommand landingGearDownCommand = new LandingGearDownCommand(landingGear);
        landingGearDownCommand.execute();
    }
}
