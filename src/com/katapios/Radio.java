package com.katapios;

public class Radio implements EnergyConsumers {
    @Override
    public void energyOn(String name) {
        System.out.println(name + " is on");
    }
}
