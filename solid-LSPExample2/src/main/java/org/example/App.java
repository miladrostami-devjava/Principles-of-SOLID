package org.example;

import org.example.correct.Square;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Square square = new Square();
        square.setWidth(32);

        System.out.println( "ss" + square.getWidth() );
    }
}
