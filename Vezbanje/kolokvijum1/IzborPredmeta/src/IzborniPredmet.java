public class IzborniPredmet extends Predmet implements IzborStudenta{


    public IzborniPredmet(String naziv, int semestar, int espb, OznakaPlana oznakaPlana) {
        super(naziv, semestar, espb, oznakaPlana);
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

    }
}
