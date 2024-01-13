package org.example.correct;

public class Car extends VehicleWithEngine {

    @Override
    public void start() {
        setName("car");
        setSpeed(1000);
        System.out.println(getName() + " " + getSpeed());
    }
}
