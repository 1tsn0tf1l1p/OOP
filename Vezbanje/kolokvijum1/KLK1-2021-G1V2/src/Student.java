import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    private int brojIndeksa;
    private int godinaUpisa;
    private List<Integer> upisaneGodine;
    private OznakaPlana plan;
    private List<Predmet> polozeniPredmeti;

    public Student(int brojIndeksa, int godinaUpisa, List<Integer> upisaneGodine, OznakaPlana plan, List<Predmet> polozeniPredmeti) {
        this.brojIndeksa = brojIndeksa;
        this.godinaUpisa = godinaUpisa;
        this.upisaneGodine = new ArrayList<>();
        this.plan = plan;
        this.polozeniPredmeti = new ArrayList<>();
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

    public int vratiTrenutnuGodinuStudija() {
        return this.upisaneGodine.getLast();
    }

    public boolean jePonovac() {

        int brojac = 0;

        for(Integer godina:upisaneGodine) {
            if(this.vratiTrenutnuGodinuStudija() == godina) {
                brojac++;
            }
        }

        if(brojac > 1) {
            return true;
        }else {
            return false;
        }
    }


}
