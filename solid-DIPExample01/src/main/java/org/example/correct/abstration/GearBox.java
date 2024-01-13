package org.example.correct.abstration;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public abstract class GearBox {
    private final Integer gearCount;

    protected GearBox(Integer gearCount) {
        this.gearCount = gearCount;
    }


}
