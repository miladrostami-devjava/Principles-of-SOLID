package org.example.correct;

import java.util.ArrayList;
import java.util.List;

public class GameHistory {
    private  final static List<Integer> history = new ArrayList<>();
public void add(Integer integer){
    history.add(integer);
}
public Integer count(){
    return history.size();

}
public void clear(){
    history.clear();
}



}
