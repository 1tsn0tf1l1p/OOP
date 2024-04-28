public class IzborniPredmet extends Predmet implements IzborStudenta{


    public IzborniPredmet(String naziv, int semestar, OznakaPlana oznakaPlana, int espb) {
        super(naziv, semestar, oznakaPlana, espb);
    }

    @Override
    public boolean mozeDaIzabere(Student student) {
        if(!student.jePonovac()) {
            return false;
        }
        if(!student.getPolozeniPredmeti().containsAll(this.getPreduslovi())) {
            return false;
        }
        if(student.getPolozeniPredmeti().contains(this)) {
            return false;
        }
        if(student.getPlan() != this.getOznakaPlana()) {
            return false;
        }

        int studentovaGodinaStudija = student.vratiTrenutnuGodinuStudija();

        if(!((this.getSemestar() == studentovaGodinaStudija*2) || (this.getSemestar() == studentovaGodinaStudija*2-1))) {
            return false;
        }

        return true;

    }
}
