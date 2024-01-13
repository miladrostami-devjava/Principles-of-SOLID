package org.example.wrong;

public class AreaCalculator {
    public Integer calculateArea(Object shape) {
        if (shape instanceof Rectangle) {
            return ((Rectangle) shape).getWidth() * ((Rectangle) shape).getHeight();
        } else if (shape instanceof Square) {
            return ((Square) shape).getWidth() * ((Square) shape).getWidth();
        } else if (shape instanceof Circle) {
            return (int) ((((Circle) shape).getRadius() * ((Circle) shape).getRadius()) * Math.PI);
        } else if (shape instanceof Triangle) {
            return (int) (((Triangle) shape).getBase() *
                    ((Triangle) shape).getHeight() * .05);
        }


        return 0;
    }
}
