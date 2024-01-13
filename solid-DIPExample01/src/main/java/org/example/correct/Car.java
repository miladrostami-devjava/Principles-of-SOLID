package org.example.correct;

import lombok.*;
import org.example.correct.abstration.Engine;
import org.example.correct.abstration.GearBox;
import org.example.correct.abstration.Tire;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Car {
    private String brand;
    private String model;
private Engine engine;
private Tire tire;
private GearBox gearBox;


}
