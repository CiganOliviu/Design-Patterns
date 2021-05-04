package com.BebiSoft;

import java.util.ArrayList;
import java.util.Iterator;

public class Airforce implements IAlliancePart {

    ArrayList<IAlliancePart> planes = new ArrayList<>();

    public void add(IAlliancePart alliancePart) {
        planes.add(alliancePart);
    }

    @Override
    public int getPersonnel() {

        Iterator<IAlliancePart> internalIterator = planes.iterator();
        int staff = 0;

        while (internalIterator.hasNext())
            staff += internalIterator.next().getPersonnel();

        return staff;
    }
}
