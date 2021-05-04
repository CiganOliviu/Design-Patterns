package com.BebiSoft;

public class Main {

    public static void main(String[] args) {

        Airforce natoAirforce = new Airforce();

        F16 f16 = new F16();
        F35 f35 = new F35();

        natoAirforce.add(f16);
        natoAirforce.add(f35);
        
        System.out.println(natoAirforce.getPersonnel());
    }
}
