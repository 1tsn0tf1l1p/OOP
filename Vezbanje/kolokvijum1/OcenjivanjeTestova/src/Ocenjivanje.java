import java.util.ArrayList;
import java.util.List;

public class Ocenjivanje {

    private List<Ocenljivo> zaOcenjivanje;

    public Ocenjivanje() {
        this.zaOcenjivanje = new ArrayList<>();
    }

    public List<Ocenljivo> getZaOcenjivanje() {
        return zaOcenjivanje;
    }

    public void setZaOcenjivanje(List<Ocenljivo> zaOcenjivanje) {
        this.zaOcenjivanje = zaOcenjivanje;
    }

    public void dodaj(Ocenljivo ocenljivo) {
        // TODO
    }

    public void ispisRezultata() {

        for(Ocenljivo o:zaOcenjivanje) {
            o.oceni();
            if(o instanceof Odgovor) {

            }else if(o instanceof ResenjeTesta) {

            }
        }

    }
}
