package org.example.correct;

public class MallardDuck extends Duck implements Flyable {
    public MallardDuck(int weight, String color) {
        super(weight, color);
    }

    @Override
    public void fly() {
        System.out.println("Fly mallard");
    }

    @Override
    public void swim() {
        System.out.println("swim mallard");

    }

    @Override
    public void sound() {
        System.out.println("sound mallard");

    }
}
