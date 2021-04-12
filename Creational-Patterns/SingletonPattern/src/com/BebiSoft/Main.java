package com.BebiSoft;

class Audi {

    private static Audi onlyInstance;

    private Audi() {

    }

    public void startEngine() {
        System.out.println("Start Engine!");
    }

    public static Audi getInstance() {

        if (onlyInstance == null)
            onlyInstance = new Audi();

        return onlyInstance;
    }
}

public class Main {

    public static void main(String[] args) {

        Audi audi = Audi.getInstance();

        audi.startEngine();
    }
}
