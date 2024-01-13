package org.example.correct;

public class CourseOnline extends Course{
    @Override
    public void subscribe(Student student) {
        // todo: subscribe to online course
        System.out.println("online : " + student.toString());

    }
}
