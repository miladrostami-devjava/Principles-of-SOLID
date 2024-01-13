package org.example.wrong;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Vehicle {
    private Integer speed;
    private String name;
    private Engine engine;
public abstract void start();

}
