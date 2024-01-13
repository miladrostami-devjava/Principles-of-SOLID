package shared;

import shared.model.Entity;
import shared.model.Person;
import shared.model.User;

import java.util.ArrayList;
import java.util.List;

public class DB {
  //  private final List<T> data = new ArrayList<>();

    private final List<Person> dataPerson = new ArrayList<>();
private final List<User> dataUser = new ArrayList<>();
public List<Person> getDataPerson(){
    return dataPerson;
}
    public List<User> getDataUser(){
        return dataUser;
    }
//    public List<Entity> getData(){
//    if (T instanceof Person){
//        return data.stream().filter(x->x instanceof Person).toList();
//    }
//    }

}
