package org.example.correct;

public class RubberDuck extends Duck {
    public RubberDuck(int weight, String color) {
        super(weight, color);
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
