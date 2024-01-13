package org.example.correct.abstration;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public abstract class Engine {
    private final Integer cylinder;

    protected Engine(Integer cylinder) {
        this.cylinder = cylinder;
    }
}
