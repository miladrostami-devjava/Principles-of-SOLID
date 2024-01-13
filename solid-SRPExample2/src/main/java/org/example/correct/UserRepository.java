package org.example.correct;

//(CRUD)
public class UserRepository {
    public void save(User user) {
        System.out.println(user.getId() + " " + "saved in database");
    }

    public void update(User user) {
        System.out.println(user.getId() +" " + "updated in database");
    }

    public void delete(User user) {
        System.out.println(user.getId() + " " +"deleted from database");
    }

    public void load(User user) {
        System.out.println(user.getId() + " " +"loaded in database");
    }
}
