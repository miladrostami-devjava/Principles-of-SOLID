package org.example.wrong;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
private Integer id;
private String username;
private String name;
public  void subscribe(Channel channel){
    channel.subscribers.add(this);

}


    public void save() {
        System.out.println("saved in database");
    }
    public void delete() {
        System.out.println("deleted from database");
    }
    public void load() {
        System.out.println("loaded in database");
    }
}
