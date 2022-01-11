package com.katapios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Switcher {

    private final List<EnergyConsumers> consumerListeners = new ArrayList<>();
    private boolean flag = false;

    public void addConsumerListeners(EnergyConsumers listener) {
        consumerListeners.add(listener);
    }

    public void removeConsumerListeners(EnergyConsumers listener) {
        consumerListeners.remove(listener);
    }

    public void switchOn() {
        System.out.println("switcher is on");

        for (EnergyConsumers c : consumerListeners) {
            c.energyOn(c.getClass().getSimpleName());
        }
        flag = true;
    }

    public void switchOff() {
        if(flag != false){
            System.out.println("switcher is off");

            consumerListeners.forEach(customer -> {
                System.out.println(customer.getClass().getSimpleName() + " is off and removed");
            });

            Iterator<EnergyConsumers> iterator = consumerListeners.iterator();
            while (iterator.hasNext()){
                iterator.next();
                iterator.remove();
            }

            //consumerListeners.subList(0, consumerListeners.size()).clear();
            //consumerListeners.removeAll(consumerListeners);

            System.out.println("В массиве: " + consumerListeners);
            System.out.println("all consumers is shutting down!");
        }else {
            System.out.println("Switcher is not on");
        }

    }

}
