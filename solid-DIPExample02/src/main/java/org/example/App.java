package org.example;

import correct.AddCal;
import correct.Calculator;
import correct.ExtraCal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
// correct :

        Calculator calculator = new Calculator(new ExtraCal());
        System.out.println(calculator.solve(2,3));



    }
}
