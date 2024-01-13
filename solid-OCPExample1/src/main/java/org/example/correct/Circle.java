package org.example.correct;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Circle implements Shape{
    private Integer radius;

    @Override
    public Integer getArea() {
        return (int) Math.PI * radius * radius;
    }
}
