package org.example;


import org.example.correct.Car;
import org.example.correct.abstration.Engine;
import org.example.correct.abstration.GearBox;
import org.example.correct.abstration.Tire;
import org.example.correct.engine.PrideEngine;
import org.example.correct.engine.SportEngine;
import org.example.correct.gearbox.AutomaticGearBox;
import org.example.correct.tire.ArmyTire;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //wrong example
    /*    Car bmw = new Car(
                "BMW",
                "E453",
                new Engine(6),
                new Tire(175,22,12),
                new GearBox(5)

        );
        System.out.println(bmw);*/

        //correct example

        Car bmw = new Car(
                "BMW",
                "E453",
                new SportEngine(66),
                new ArmyTire(175,22,12),
                new AutomaticGearBox(5)

        );


    }
}
