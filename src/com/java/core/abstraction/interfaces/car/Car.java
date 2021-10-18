package com.java.core.abstraction.interfaces.car;

public interface Car {
    String name="CAR";
    void start();
    void stop();
    default void drive()
    {
driveCar();
    }
    private void driveCar()
    {
        System.out.println("Driving a car");
    }

}
