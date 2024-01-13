package org.example;

import org.example.correct.Game;
import org.example.correct.GameHistory;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*wrong Example*/
       /* Game newGame = new Game();
        Scanner scanner = new Scanner(System.in);
        while (!newGame.guess(scanner.nextInt()));*/

        /*correct Example*/
        GameHistory history = new GameHistory();
        Game game = new Game(history);
        Scanner scanner = new Scanner(System.in);
        while (!game.guess(scanner.nextInt()));


    }
}