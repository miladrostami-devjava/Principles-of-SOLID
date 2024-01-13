package org.example;

import org.example.correct.DebugLogger;
import org.example.correct.Logger;

/**
 * Hello world!
 */
public class App {
    //private static final Logger<App> logger = new Logger<>(App.class);
    private static final Logger<App> logger = new DebugLogger<>(App.class);

    public static void main(String[] args) {

        /*Wrong Example*/
try {
    int i = 90;

    logger.debug("i =" + i);
    throw new Exception("debug state!!!");

}catch (Exception e){
    logger.error("error" + " "+ e.getMessage());
}



        /*Correct Example*/

    }
}
