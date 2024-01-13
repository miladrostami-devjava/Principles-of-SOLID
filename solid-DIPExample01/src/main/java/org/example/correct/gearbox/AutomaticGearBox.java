package org.example.correct.gearbox;


import lombok.Getter;
import lombok.Setter;
import org.example.correct.abstration.GearBox;

@Getter
@Setter
public class AutomaticGearBox extends GearBox {


    public AutomaticGearBox(Integer gearCount) {
        super(gearCount);
    }
}
