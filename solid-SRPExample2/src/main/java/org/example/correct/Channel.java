package org.example.correct;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class Channel {
    private Integer id;
    private String name;
    private String link;
    private Set<User> subscribers = new HashSet<>();

    public Channel(Integer id, String name, String link) {
        this.id = id;
        this.name = name;
        this.link = link;
    }

    public void subscribe(User user) {
        subscribers.add(user);

    }
}
