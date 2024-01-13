package org.example;

import org.example.correct.Course;
import org.example.correct.CourseOffline;
import org.example.correct.CourseOnline;
import org.example.correct.Student;
import org.example.correct.services.Notification;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    /*    Student student = new Student("milad","4343232");
        Course math = new Course("math2","4345445","online");
        math.subscribe(student);*/

        Student student = new Student("ali","46665342");
        Course math = new CourseOnline();
        Course road = new CourseOffline();
        Notification notification = new Notification();
        notification.notification(student);
        road.subscribe(student);
        math.subscribe(student);



    }
}
