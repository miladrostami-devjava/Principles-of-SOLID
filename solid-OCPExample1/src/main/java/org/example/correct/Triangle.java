package org.example.correct;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Triangle implements Shape{
private Integer base;
private Integer height;


    @Override
    public Integer getArea() {
        return base * height * 1/2;
    }
}
