package com.BebiSoft;

class LuxuryClass implements IAircraft {

    IAircraft boeing;

    public LuxuryClass(IAircraft boeing) {
        this.boeing = boeing;
    }

    @Override
    public void fly() {
        boeing.fly();
    }

    @Override
    public void land() {
        boeing.land();
    }

    @Override
    public float getWeight() {
        return (10 * boeing.getWeight());
    }
}

class BulletProof implements IAircraft {

    IAircraft boeing;

    public BulletProof(IAircraft boeing) {
        this.boeing = boeing;
    }

    @Override
    public void fly() {
        boeing.fly();
    }

    @Override
    public void land() {
        boeing.land();
    }

    @Override
    public float getWeight() {
        return (30 + boeing.getWeight());
    }
}
