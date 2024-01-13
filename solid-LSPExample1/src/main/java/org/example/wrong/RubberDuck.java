package org.example.wrong;

public class RubberDuck extends Duck{
    public RubberDuck(int weight, String color) {
        super(weight, color);
    }

    @Override
    public void fly() {
        System.out.println("rubber duck no fly!!!");
    }

    @Override
    public void swim() {
        System.out.println("rubber duck yes swim!!!");

    }

    @Override
    public void sound() {
        System.out.println("rubber duck yes sound!!!");

    }
}
