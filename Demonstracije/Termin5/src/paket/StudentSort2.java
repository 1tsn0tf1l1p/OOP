package paket;

import java.util.Comparator;

public class StudentSort2 implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getIme().compareTo(o2.getIme());
    }
}
