import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class SviIzboriStudenata {

    private List<StudentIzabrao> izboriSvihStudenata;

    public SviIzboriStudenata() {
        this.izboriSvihStudenata = new ArrayList<>();
    }

    public List<StudentIzabrao> getIzboriSvihStudenata() {
        return izboriSvihStudenata;
    }

    public void setIzboriSvihStudenata(List<StudentIzabrao> izboriSvihStudenata) {
        this.izboriSvihStudenata = izboriSvihStudenata;
    }

    public void dodajStudenta(Student student, IzborStudenta izborStudenta) {
        if(student.jePonovac()) {
            if(izborStudenta instanceof IzborniPredmet) {
                StudentIzabrao si = new StudentIzabrao(student, izborStudenta);
                izboriSvihStudenata.add(si);
            }
        }else {
            if(izborStudenta instanceof IzbornaGrupa || izborStudenta instanceof IzborniModul) {
                StudentIzabrao si = new StudentIzabrao(student, izborStudenta);
                izboriSvihStudenata.add(si);
            }
        }
    }

    public void ispisiUFajl() {

        try {
            PrintWriter pw = new PrintWriter("ispis.txt");

            for (StudentIzabrao studentIzabrao : izboriSvihStudenata) {
                if(studentIzabrao.getIzborStudenta() instanceof IzborniPredmet) {
                    pw.write(studentIzabrao.getStudent().getBrojIndeksa() + " " + ((IzborniPredmet) studentIzabrao.getIzborStudenta()).getNaziv() + "\n");
                }
                if(studentIzabrao.getIzborStudenta() instanceof IzborniModul) {
                    pw.write(studentIzabrao.getStudent().getBrojIndeksa() + " " + ((IzborniModul) studentIzabrao.getIzborStudenta()).getNaziv() + "\n");
                }
                if(studentIzabrao.getIzborStudenta() instanceof IzbornaGrupa) {
                    pw.write(studentIzabrao.getStudent().getBrojIndeksa() + " " + ((IzbornaGrupa) studentIzabrao.getIzborStudenta()).getOznaka() + "\n");
                }
            }

            pw.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
