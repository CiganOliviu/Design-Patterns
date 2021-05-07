package com.BebiSoft;

public class Boeing747 implements IAircraft {
    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public void land() {
        System.out.println("Land");
    }

    @Override
    public float getWeight() {
        return baseWeight;
    }
}
