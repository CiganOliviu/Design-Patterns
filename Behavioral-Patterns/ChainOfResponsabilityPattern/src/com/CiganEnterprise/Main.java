package com.CiganEnterprise;

public class Main {

    public static void main(String[] args) {
        AbstractHandler lowFuelHandler = new LowFuelHandler(null);
        FireHandler fireHandler = new FireHandler(lowFuelHandler);

        LowFuelRequest lowFuelRequest = new LowFuelRequest(1);

        fireHandler.HandleRequest(lowFuelRequest);
    }
}
