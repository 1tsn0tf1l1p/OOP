package paket;

import java.util.Comparator;

public class StudentSort1 implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getIndex() - o2.getIndex();
    }
}
