package com.CiganEnterprise;

import java.io.*;
import java.io.ObjectInputStream;

public class BlackBox implements Serializable {

    private final long altitude;
    private final double speed;
    private final float engineTemperature;
    private final static long serialVersionID = 1L;

    public BlackBox(long altitude, double speed, float engineTemperature) {
        this.altitude = altitude;
        this.speed = speed;
        this.engineTemperature = engineTemperature;
    }

    public void DisplayData() {
        System.out.println(this.altitude);
        System.out.println(this.speed);
        System.out.println(this.engineTemperature);
    }

    public byte[] GetState() throws IOException {

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutput out = null;
        byte[] memento = null;

        try {
            out = new ObjectOutputStream(bos);
            out.writeObject(this);
            out.flush();
            memento = bos.toByteArray();

        } finally {
            try {
                bos.close();

            } catch (IOException ignored) {

            }
        }

        return memento;
    }

    public BlackBox SetState(byte[] memento) throws Exception {

        ByteArrayInputStream bis = new ByteArrayInputStream(memento);

        ObjectInputStream objectInputStream
                = new ObjectInputStream(bis);
        BlackBox blackBox = (BlackBox) objectInputStream.readObject();
        objectInputStream.close();

        return blackBox;
    }
}
