package org.example.correct;

public class HumanWorker implements
        Worker,Work,EatableWorker,SleepWorker {
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");

    }

    @Override
    public void work() {
        System.out.println("work");

    }
}
