package org.example.wrong;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public abstract class Duck {
    private int weight;
    private String color;

    public abstract void fly();

    public abstract void swim();

    public abstract void sound();


}
