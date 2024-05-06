import java.util.ArrayList;
import java.util.List;

public class StudentIzabrao {

    private Student student;
    private List<IzborStudenta> izborStudenta;

    public StudentIzabrao(Student student, IzborStudenta izborStudenta) {
        this.student = student;
        this.izborStudenta = new ArrayList<>();
        this.izborStudenta.add(izborStudenta);
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<IzborStudenta> getIzborStudenta() {
        return izborStudenta;
    }

    public void setIzborStudenta(List<IzborStudenta> izborStudenta) {
        this.izborStudenta = izborStudenta;
    }
}
