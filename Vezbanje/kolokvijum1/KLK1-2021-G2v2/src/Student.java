import java.util.List;

public class Student {

    private String studProgramOznaka;
    private int broj;
    private int godinaUpisa;
    private List<AktivnostStudenta> aktivnosti;
    private List<Predmet> polozeniPredmeti;

    public Student() {

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

    public boolean dodajAktivnost(AktivnostStudenta aktivnostStudenta) {
        // TODO
    }

    public int vratiGodinuStudija() {
        // TODO
    }

    public boolean jePonovac() {
        // TODO
    }

    public boolean slusaPredmet(Predmet predmet) {
        // TODO
    }

}
