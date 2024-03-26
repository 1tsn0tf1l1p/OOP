import java.util.List;

public class IzbornaGrupa implements IzborStudenta {

    private String oznaka;
    private OznakaPlana plan;
    private List<IzborniPredmet> predmeti;

    public IzbornaGrupa() {
    }



    @Override
    public boolean mozeDaIzabere(Student student) {
        return false;
    }
}
