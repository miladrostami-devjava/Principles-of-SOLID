
package org.example.correct;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Course {
    private String name;
    private String code;
    private Integer price;


    public abstract void subscribe(Student student) ;


}
/*
*
*
*
*         if (type == "online") {

        } else if (type == "offline") {

        }

        // todo:: payment
        // todo:: notification
        // todo:: access to course
* */