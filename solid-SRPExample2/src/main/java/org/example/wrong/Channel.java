package org.example.wrong;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Channel {
    private Integer id;
    private String name;
    private String link;
public List<User> subscribers = new ArrayList<>();


}
