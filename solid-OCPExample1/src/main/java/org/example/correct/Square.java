package org.example.correct;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Square implements Shape {

    private Integer width;

    @Override
    public Integer getArea() {
        return width*width;
    }
}
