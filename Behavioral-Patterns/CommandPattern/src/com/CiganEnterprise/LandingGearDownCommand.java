package com.CiganEnterprise;

class LandingGear {
    // commands to perform landing
}

public class LandingGearDownCommand implements ICommand {

    LandingGear landingGear;

    public LandingGearDownCommand(LandingGear landingGear) {
        this.landingGear = landingGear;
    }

    @Override
    public void execute() {
        // execute landing gear commands
    }
}
