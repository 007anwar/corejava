package com.java.core.abstraction.interfaces.car;

import com.java.core.abstraction.interfaces.car.Car;
import com.java.core.abstraction.interfaces.car.Honda;

public class Test {
    public static void main(String[] args) {
        Car honda = new Honda();
        honda.start();
        honda.drive();
        honda.stop();
    }
}
