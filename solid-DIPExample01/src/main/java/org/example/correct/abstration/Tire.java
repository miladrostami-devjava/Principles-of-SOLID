package org.example.correct.abstration;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public abstract class Tire {
    private final Integer size;
    private final Integer ratio;
    private final Integer rim;

    protected Tire(Integer size, Integer ratio, Integer rim) {
        this.size = size;
        this.ratio = ratio;
        this.rim = rim;
    }
}
