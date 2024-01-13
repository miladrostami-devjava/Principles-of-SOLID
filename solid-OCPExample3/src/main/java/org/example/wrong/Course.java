package org.example.wrong;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private String name;
    private String code;
    private String type;

    public void subscribe(Student student){
        if (type == "online"){
// todo: subscribe to online course
        } else if (type == "offline") {
            // todo:: subscribe to offline course
        }

        // todo:: payment
        // todo:: notification
        // todo:: access to course


    }



}
