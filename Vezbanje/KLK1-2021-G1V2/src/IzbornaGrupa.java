import java.util.List;

public class IzbornaGrupa implements IzborStudenta{

    private String oznaka;
    private OznakaPlana plan;
    private List<IzborniPredmet> predmeti;

    public IzbornaGrupa() {
    }

    @Override
    public boolean mozeDaIzabere(Student student) {
        if(student.jePonovac()) {
            return false;
        }
        if(!(this.oznaka.charAt(0) == student.vratiTrenutnuGodinuStudija())) {
            return false;
        }
        if(!(this.plan == student.getPlan())) {
            return false;
        }
        if()

    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public OznakaPlana getPlan() {
        return plan;
    }

    public void setPlan(OznakaPlana plan) {
        this.plan = plan;
    }

    public List<IzborniPredmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(List<IzborniPredmet> predmeti) {
        this.predmeti = predmeti;
    }

    public boolean dodajPredmet(IzborniPredmet izborniPredmet) {
        // TODO
    }

}
