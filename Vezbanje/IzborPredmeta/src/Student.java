import java.util.ArrayList;
import java.util.List;

public class Student {

    private int brojIndeksa;
    private int godinaUpisa;
    private List<Integer> upisaneGodine;
    private OznakaPlana plan;
    private List<Predmet> polozeniPredmeti;

    public Student(int brojIndeksa, int godinaUpisa, OznakaPlana plan) {
        this.brojIndeksa = brojIndeksa;
        this.godinaUpisa = godinaUpisa;
        this.plan = plan;
        this.polozeniPredmeti = new ArrayList<>();
        this.upisaneGodine = new ArrayList<>();
    }

    public int vratiTrenutnuGodinuStudija() {
        return this.upisaneGodine.getLast();
    }

    public boolean jePonovac() {

        int poslednjaUpisanaGodina = this.upisaneGodine.getLast();

        int cnt = 0;

        for(Integer i:upisaneGodine) {
            if(i==poslednjaUpisanaGodina) {
                cnt++;
            }
        }

        if(cnt>2) {
            return true;
        }else{
            return false;
        }

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

    public OznakaPlana getPlan() {
        return plan;
    }

    public void setPlan(OznakaPlana plan) {
        this.plan = plan;
    }

    public List<Predmet> getPolozeniPredmeti() {
        return polozeniPredmeti;
    }

    public void setPolozeniPredmeti(List<Predmet> polozeniPredmeti) {
        this.polozeniPredmeti = polozeniPredmeti;
    }
}
