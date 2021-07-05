package com.CiganEnterprise;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> companies = new ArrayList<>();
        companies.add("3SS");
        companies.add("SoftVision");
        companies.add("Siemens");

        Iterator<String> iterator = companies.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
