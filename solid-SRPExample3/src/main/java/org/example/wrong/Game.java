package org.example.wrong;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Game {
    private final Integer magicNumber;
private  final List<Integer> history;

    public Game() {
      history = new ArrayList<>();
        magicNumber = generic();
        System.out.println(magicNumber);
    }

    private Integer generic() {
        return  new Random(new Date().getTime()).nextInt(100,200);
    }
    public boolean guess(Integer integer){
        history.add(integer);
        if (integer.equals(magicNumber)){
            System.out.println("winner winner chicken  winner");
        } else if (integer < magicNumber) {
            System.out.println("Magic number is bigger!");
        }else {
            System.out.println("Magic number is lower!");        }

        return false;
    }
}
