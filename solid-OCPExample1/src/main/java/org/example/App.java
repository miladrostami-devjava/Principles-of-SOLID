package org.example;

import org.example.correct.Circle;
import org.example.correct.Shape;
import org.example.correct.Square;
import org.example.correct.AreaCalculator;
import org.example.correct.Rectangle;
import org.example.correct.Triangle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*Wrong Example*/
    /*    Rectangle rectangle1 = new Rectangle();
        Triangle triangle = new Triangle();
        triangle.setBase(20);
        triangle.setHeight(10);
       *//* rectangle1.setWidth(50);
        rectangle1.setHeight(100);*//*
        AreaCalculator area = new AreaCalculator();
        int resultArea = area.calculateArea(triangle);

        System.out.println( "area shape :" + " " + resultArea );*/

        /*Correct Example*/
        Rectangle rectangle1 = new Rectangle();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Square square = new Square();
        square.setWidth(58);
        circle.setRadius(33);
        triangle.setHeight(33);
        triangle.setBase(45);
        rectangle1.setHeight(20);
        rectangle1.setWidth(20);
        Shape[] shapes =new Shape[4];
        shapes[0] = (Shape) rectangle1;
        shapes[1] = (Shape) triangle;
        shapes[2] = circle;
        shapes[3] = square;

        AreaCalculator area = new AreaCalculator();
        int resultArea = area.calculateArea(shapes);

        System.out.println( "area shape :" + " " + resultArea );



    }
}
