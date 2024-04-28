import java.util.ArrayList;
import java.util.List;

public class Student {

    private int brojIndeksa;
    private int godinaUpisa;
    private List<Integer> upisaneGodine;
    private List<Predmet> polozeniPredmeti;
    private OznakaPlana plan;

    public Student(OznakaPlana plan, int brojIndeksa, int godinaUpisa) {
        this.plan = plan;
        this.brojIndeksa = brojIndeksa;
        this.godinaUpisa = godinaUpisa;
        this.upisaneGodine = new ArrayList<>();
        this.polozeniPredmeti= new ArrayList<>();
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public int getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(int godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    public List<Integer> getUpisaneGodine() {
        return upisaneGodine;
    }

    public void setUpisaneGodine(List<Integer> upisaneGodine) {
        this.upisaneGodine = upisaneGodine;
    }

    public List<Predmet> getPolozeniPredmeti() {
        return polozeniPredmeti;
    }

    public void setPolozeniPredmeti(List<Predmet> polozeniPredmeti) {
        this.polozeniPredmeti = polozeniPredmeti;
    }

    public OznakaPlana getPlan() {
        return plan;
    }

    public void setPlan(OznakaPlana plan) {
        this.plan = plan;
    }

    public int vratiTrenutnuGodinuStudija() {
        return this.upisaneGodine.getLast();
    }

    public boolean jePonovac() {
        int poslednjaUpisanaGodina = this.upisaneGodine.getLast();

        int cnt = 0;

        for (Integer i : upisaneGodine) {
            if(i == poslednjaUpisanaGodina) {
                cnt++;
            }
        }

        return cnt > 1;
    }

}
