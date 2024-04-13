import java.util.ArrayList;
import java.util.List;

public class IzborniModul implements IzborStudenta{

    private String naziv;
    private List<Predmet> predmeti;

    public IzborniModul(String naziv) {
        this.naziv = naziv;
        this.predmeti = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(List<Predmet> predmeti) {
        this.predmeti = predmeti;
    }

    public void dodajPredmetUIzborniModul(Predmet predmet) {
        if(!(predmet.getSemestar() == 5 ||
           predmet.getSemestar() == 6 ||
           predmet.getSemestar() == 7 ||
           predmet.getSemestar() == 8)) {
            return;
        }

        this.predmeti.add(predmet);
    }

    @Override
    public boolean mozeDaIzabere(Student student) {
        if(student.vratiTrenutnuGodinuStudija() != 3) {
            return false;
        }
        if(student.jePonovac()) {
            return false;
        }

        return true;

    }
}
