package wrong;

import lombok.*;

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
