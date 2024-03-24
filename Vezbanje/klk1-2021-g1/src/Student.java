import java.util.ArrayList;
import java.util.List;

public class Student {

    private int brojIndeksa;
    private int godinaUpisa;
    private List<Integer> upisaneGodine;
    private OznakaPlana oznakaPlana;
    private List<Predmet> polozeniPredmeti;

    public Student(int brojIndeksa, int godinaUpisa, List<Integer> upisaneGodine, OznakaPlana oznakaPlana, List<Predmet> polozeniPredmeti) {
        this.brojIndeksa = brojIndeksa;
        this.godinaUpisa = godinaUpisa;
        this.upisaneGodine = new ArrayList<>();
        this.oznakaPlana = oznakaPlana;
        this.polozeniPredmeti = new ArrayList<>();
    }
}
