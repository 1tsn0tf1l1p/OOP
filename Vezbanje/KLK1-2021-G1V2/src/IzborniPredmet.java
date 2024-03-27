import java.util.List;

public class IzborniPredmet extends Predmet implements IzborStudenta{

    public IzborniPredmet(String naziv, int semestar, int espb, OznakaPlana oznakaPlana, List<Predmet> preduslovi) {
        super(naziv, semestar, espb, oznakaPlana, preduslovi);
    }

    public boolean daLiJePolozioPreduslove(Student student) {

        if(student.getPolozeniPredmeti().containsAll(super.getPreduslovi())) {
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean mozeDaIzabere(Student student) {
        if(!student.jePonovac()) {
            return false;
        }
        if(!daLiJePolozioPreduslove(student)) {
            return false;
        }
        if(student.getPolozeniPredmeti().contains(this)) {
            return false;
        }
        if(!(student.getPlan() == this.getOznakaPlana())) {
            return false;
        }

        int neparni = student.vratiTrenutnuGodinuStudija()*student.vratiTrenutnuGodinuStudija() - 1;
        int parni = student.vratiTrenutnuGodinuStudija()*student.vratiTrenutnuGodinuStudija();

        boolean b = getSemestar() == neparni || this.getSemestar() == parni;
        if(!b) {
            return false;
        }

        return true;


    }
}
