import java.util.List;

public class IzborniPredmet extends Predmet implements IzborStudenta{


    public IzborniPredmet(String naziv, int semestar, int espb, OznakaPlana oznakaPlana, List<Predmet> preduslovi) {
        super(naziv, semestar, espb, oznakaPlana, preduslovi);
    }

    @Override
    public boolean mozeDaIzabere() {
        return false;
    }
}
