import java.util.ArrayList;
import java.util.List;

public class Muzicar extends Ucesnik{

    private boolean vokal;
    private List<Instrument> instrumenti;

    public Muzicar(String ime, boolean vokal) {
        super(ime);
        this.instrumenti = new ArrayList<>();
        this.vokal = vokal;
    }

    public boolean isVokal() {
        return vokal;
    }

    public void setVokal(boolean vokal) {
        this.vokal = vokal;
    }

    public List<Instrument> getInstrumenti() {
        return instrumenti;
    }

    public void setInstrumenti(List<Instrument> instrumenti) {
        this.instrumenti = instrumenti;
    }

    @Override
    public String toString() {
        return "Muzicar{" +
                "vokal=" + vokal +
                '}';
    }
}
