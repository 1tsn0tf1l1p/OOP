import java.util.List;

public class IzbornaGrupa implements IzborStudenta{

    private String oznaka;
    private OznakaPlana plan;
    private List<IzborniPredmet> predmeti;

    public IzbornaGrupa() {
    }

    @Override
    public boolean mozeDaIzabere(Student student) {
        if (student.jePonovac()) {
            return false;
        }
        if ((oznaka.charAt(0) == student.vratiTrenutnuGodinuStudija())) {
            return false;
        }
        if (!(student.getPlan() == this.plan)) {
            return false;
        }

        for (Predmet predmet : student.getPolozeniPredmeti()) {

            if (!(student.getPolozeniPredmeti().equals(predmet))) {
                return false;
            }

        }

        return true;

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
        int semestar = izborniPredmet.getSemestar();
        if((semestar*2 == (int)this.oznaka.charAt(0) ||
           semestar*2 == (int)this.oznaka.charAt(0) - 1) &&
                ((izborniPredmet.getOznakaPlana() == this.plan) &&
                (!predmeti.contains(izborniPredmet)))) {

                    predmeti.add(izborniPredmet);
                    return true;

        }
        else {
            return false;
        }

    }

}
