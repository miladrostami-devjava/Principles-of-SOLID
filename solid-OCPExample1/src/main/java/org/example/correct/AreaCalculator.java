package org.example.correct;



public class AreaCalculator   {
/*    public Integer calculateArea(Shape shape) {
        return shape.getArea();
    }*/
    public Integer calculateArea(Shape[] shape) {
        int sum = 0;
        for (Shape value:shape) {
            sum += value.getArea();
        }
        return sum;
    }

}
