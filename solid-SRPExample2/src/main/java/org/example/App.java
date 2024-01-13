package org.example;

import org.example.correct.Channel;
import org.example.correct.User;
import org.example.correct.UserRepository;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /* wrong Example*/
    /*    User ali = new User(
                1,
                "ali1322",
                "ali zare"
        );
        ali.save();
        Channel mahersho = new Channel(
                120,
                "mahersho",
                "https://www.youtube,com/mahersho",
                new ArrayList<>()
        );
ali.subscribe(mahersho);*/

        /* correct Example*/
        UserRepository userRepository = new UserRepository();

        User ali = new User(
                1,
                "ali1322",
                "ali zare"
        );
userRepository.save(ali);
userRepository.load(ali);
userRepository.update(ali);
userRepository.delete(ali);
        Channel mahersho = new Channel(
                120,
                "mahersho",
                "https://www.youtube,com/mahersho"

        );
        mahersho.subscribe(ali);
        System.out.println(ali);

    }
}
