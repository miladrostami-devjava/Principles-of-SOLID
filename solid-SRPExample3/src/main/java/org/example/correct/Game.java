package org.example.correct;


public class Game {
    private final Integer magicNumber;
private final GameHistory history;
    public Game(GameHistory history) {
        this.history = history;
        magicNumber = RandomUtil.generic(100,200);
    }

    public boolean guess(Integer number){
history.add(number);
        if (number.equals(magicNumber)){
            System.out.println("winner winner chicken  winner");
            System.out.println("Try count :" + " "+ history.count());
            return true;
        } else if (magicNumber > number) {
            System.out.println("Magic number is bigger!");
        }else {            System.out.println("Magic number is lower!");        }

        return false;
    }
}
