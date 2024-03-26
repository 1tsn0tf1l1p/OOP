package paket;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Zoran");
        Student s2 = new Student(3, "Marko");
        Student s3 = new Student(37, "Borivoje");
        Student s4 = new Student(56, "Fike");

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        Collections.sort(students);

        for(Student student:students) {
            System.out.println(student.getIme()+student.getIndex());
        }

    }
}
