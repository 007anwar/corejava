package com.java.core.abstraction.interfaces.car;

import com.java.core.abstraction.interfaces.car.Car;

public class Honda implements Car {
    @Override
    public void start() {
        System.out.println("Starting honda");
    }

    @Override
    public void stop() {
        System.out.println("Stoping Honda");
    }

    @Override
    public void drive() {
        System.out.println("Driving a Honda car");
    }
}
