package org.example.correct;

public class CourseOffline extends Course{
    @Override
    public void subscribe(Student student) {
        // todo:: subscribe to offline course
        System.out.println("offline : " + student.toString());
    }
}
