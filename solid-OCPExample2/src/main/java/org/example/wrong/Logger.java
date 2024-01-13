package org.example.wrong;

public class Logger<T> {
    private Class<T> tClass;

    public Logger(Class<T> tClass) {
        this.tClass = tClass;
    }

    public void error(String message) {
        System.out.println("ERROR (" + tClass.getName() + ") : " + message);
        //todo : log to db (error_table)
    }

    public void debug(String message) {
        System.out.println(message);
    }

    public void info(String message) {
        System.out.println("INFO ( " + tClass.getName() + ") : " + message);

    }

    public void warning(String message) {
        System.out.println("WARNING ( " + tClass.getName() + " ):  " + message);
        //todo : log to db (warning_table)
    }


}
