import java.util.ArrayList;
import java.util.List;

public class Student {

    private String studProgramOznaka;
    private int broj;
    private int godinaUpisa;
    private List<AktivnostStudenta> aktivnosti;
    private List<Predmet> polozeniPredmeti;

    public Student() {
        this.aktivnosti = new ArrayList<>();
        this.polozeniPredmeti = new ArrayList<>();
    }

    public boolean dodajAktivnost(AktivnostStudenta aktivnostStudenta) {
        return false;
    }

    public int vratiGodinuStudija() {
        return 0;
    }

    public boolean jePonovac() {
        return false;
    }

    public boolean slusaPredmet(Predmet predmet) {
        return false;
    }

    public String getStudProgramOznaka() {
        return studProgramOznaka;
    }

    public void setStudProgramOznaka(String studProgramOznaka) {
        this.studProgramOznaka = studProgramOznaka;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public int getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(int godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    public List<AktivnostStudenta> getAktivnosti() {
        return aktivnosti;
    }

    public void setAktivnosti(List<AktivnostStudenta> aktivnosti) {
        this.aktivnosti = aktivnosti;
    }

    public List<Predmet> getPolozeniPredmeti() {
        return polozeniPredmeti;
    }

    public void setPolozeniPredmeti(List<Predmet> polozeniPredmeti) {
        this.polozeniPredmeti = polozeniPredmeti;
    }
}
