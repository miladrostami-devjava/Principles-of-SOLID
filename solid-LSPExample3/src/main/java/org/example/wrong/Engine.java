package org.example.wrong;

public class Engine {

    private void preStart(){
        System.out.println("pre start");
    }
    public void start(){
        System.out.println(" start");
        preStart();
        afterStart();
    }
    private void afterStart(){
        System.out.println("after start");
    }

}
