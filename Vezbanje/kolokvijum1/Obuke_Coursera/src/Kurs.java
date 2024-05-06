import java.util.ArrayList;
import java.util.List;

public class Kurs extends Obuka{

    private boolean onlajn;
    private List<Kurs> preduslovi;

    public Kurs(String naziv, Oblast oblast, int minimalanBrojPolaznika, boolean onlajn) {
        super(naziv, oblast, minimalanBrojPolaznika);
        this.onlajn = onlajn;
        this.preduslovi = new ArrayList<>();
    }

    public boolean isOnlajn() {
        return onlajn;
    }

    public void setOnlajn(boolean onlajn) {
        this.onlajn = onlajn;
    }

    public List<Kurs> getPreduslovi() {
        return preduslovi;
    }

    public void setPreduslovi(List<Kurs> preduslovi) {
        this.preduslovi = preduslovi;
    }
}
