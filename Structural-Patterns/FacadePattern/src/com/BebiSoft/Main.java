package com.BebiSoft;

class AutopilotFacade {

    private AltitudeMonitor altitudeMonitor;
    private EngineController engineController;
    private FuelMonitor fuelMonitor;
    private NavigationSystem navigationSystem;

    public AutopilotFacade(AltitudeMonitor altitudeMonitor, EngineController engineController, FuelMonitor fuelMonitor,
                           NavigationSystem navigationSystem) {

        this.altitudeMonitor = altitudeMonitor;
        this.engineController = engineController;
        this.fuelMonitor = fuelMonitor;
        this.navigationSystem = navigationSystem;
    }

    public void autopilotOn() {
        altitudeMonitor.autoMonitor();
        engineController.setEngineSpeed(1100);
        navigationSystem.setDirectionBasedOnSpeedAndFuel(
                fuelMonitor.getLiters(),
                engineController.getEngineSpeed()
        );
    }

    public void AutopilotOff() {
        altitudeMonitor.turnOff();
        engineController.turnOff();
        navigationSystem.turnOff();
        fuelMonitor.turnOff();
    }
}

public class Main {

    public static void main(String[] args) {

    }
}
