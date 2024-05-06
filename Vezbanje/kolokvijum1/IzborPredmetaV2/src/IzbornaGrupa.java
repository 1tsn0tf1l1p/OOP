import java.util.ArrayList;
import java.util.List;

public class IzbornaGrupa implements IzborStudenta{

    private String oznaka;
    private List<IzborniPredmet> predmeti;
    private OznakaPlana plan;

    public IzbornaGrupa() {
        this.predmeti = new ArrayList<>();
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public List<IzborniPredmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(List<IzborniPredmet> predmeti) {
        this.predmeti = predmeti;
    }

    public OznakaPlana getPlan() {
        return plan;
    }

    public void setPlan(OznakaPlana plan) {
        this.plan = plan;
    }

    public boolean dodajPredmet(IzborniPredmet izborniPredmet) {
        if(!(izborniPredmet.getSemestar()/2 == ((int) this.oznaka.charAt(0)) || (izborniPredmet.getSemestar()/2 +1) == ((int) this.oznaka.charAt(0)))) {
            return false;
        }
        if(this.plan != izborniPredmet.getOznakaPlana()) {
            return false;
        }
        for (IzborniPredmet predmet : predmeti) {
            int cnt = 0;
            for (IzborniPredmet izborniPredmet1 : predmeti) {
                        if(izborniPredmet1.equals(predmet)) {
                            cnt++;
                        }
            }
            if(cnt > 0) {
                return false;
            }

        }

        return true;
    }

    @Override
    public boolean mozeDaIzabere(Student student) {
        if(student.jePonovac()) {
            return false;
        }
        if(!(student.vratiTrenutnuGodinuStudija() == (int) this.oznaka.charAt(0))) {
            return false;
        }
        if(this.getPlan() != student.getPlan()) {
            return false;
        }
        for (IzborniPredmet izborniPredmet : predmeti) {
            if(!student.getPolozeniPredmeti().containsAll(izborniPredmet.getPreduslovi())) {
                return false;
            }
        }

        return true;
    }
}
