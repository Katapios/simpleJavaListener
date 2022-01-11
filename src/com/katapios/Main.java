package com.katapios;

public class Main {

    public static void main(String[] args) {

        Switcher switcher = new Switcher();

        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        switcher.addConsumerListeners(lamp);
        switcher.addConsumerListeners(radio);
        switcher.addConsumerListeners(radio);

        switcher.removeConsumerListeners(radio);

        switcher.switchOn();
        switcher.switchOff();
    }
}
