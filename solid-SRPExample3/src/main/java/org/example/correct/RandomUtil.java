package org.example.correct;

import java.util.Date;
import java.util.Random;

public class RandomUtil {
    public static Integer generic(Integer start,Integer end) {
        return  new Random(new Date().getTime()).nextInt(start,end);
    }

}
