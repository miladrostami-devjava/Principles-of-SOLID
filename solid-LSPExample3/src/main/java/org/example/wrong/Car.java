package org.example.wrong;

public class Car extends Vehicle{
    @Override
    public void start() {
        getEngine().start();
    }
}
