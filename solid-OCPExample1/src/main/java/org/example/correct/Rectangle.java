package org.example.correct;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rectangle implements Shape {
    private Integer width;
    private Integer height;

    @Override
    public Integer getArea() {
        return width * height;
    }
}
