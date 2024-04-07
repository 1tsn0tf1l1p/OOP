import java.util.List;

public class IzbornaGrupa implements IzborStudenta{

    private String oznaka;
    private List<IzborniPredmet> predmeti;
    private OznakaPlana plan;

    public IzbornaGrupa() {
    }

    public boolean dodajPredmet(IzborniPredmet izborniPredmet) {
        return false;
    }

    @Override
    public boolean mozeDaIzabere(Student student) {
        return false;
    }
}
