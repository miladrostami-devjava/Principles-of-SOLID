package org.example.correct.gearbox;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.correct.abstration.GearBox;


@Getter
@Setter

public class ManualGearBox extends GearBox {


    public ManualGearBox(Integer gearCount) {
        super(gearCount);
    }
}
