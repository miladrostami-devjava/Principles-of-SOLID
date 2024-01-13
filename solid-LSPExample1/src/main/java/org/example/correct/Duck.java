package org.example.correct;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public abstract class Duck {
    private int weight;
    private String color;



    public abstract void swim();

    public abstract void sound();


}
