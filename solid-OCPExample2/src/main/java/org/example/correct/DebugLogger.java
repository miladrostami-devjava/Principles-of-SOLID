package org.example.correct;

public class DebugLogger<T> extends Logger<T> {
    public DebugLogger(Class<T> tClass) {
        super(tClass);
    }

    @Override
    public void debug(String message) {
        System.out.println("DEBUGGGGGG! (" + tClass.getName() + ") " + " " + message.toUpperCase());
    }
}
