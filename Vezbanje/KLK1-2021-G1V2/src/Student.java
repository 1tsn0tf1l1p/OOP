import java.util.ArrayList;
import java.util.List;

public class Student {

    private int brojIndeksa;
    private int godinaUpisa;
    private OznakaPlana plan;
    private List<Integer> upisaneGodine;
    private List<Predmet> polozeniPredmeti;

    public Student(int brojIndeksa, int godinaUpisa, OznakaPlana plan, List<Integer> upisaneGodine, List<Predmet> polozeniPredmeti) {
        this.brojIndeksa = brojIndeksa;
        this.godinaUpisa = godinaUpisa;
        this.plan = plan;
        this.upisaneGodine = new ArrayList<>();
        this.polozeniPredmeti = new ArrayList<>();
    }

    public int vratiTrenutnuGodinuStudija() {
        // TODO
    }

    public boolean jePonovac() {
        // TODO
    }



}
