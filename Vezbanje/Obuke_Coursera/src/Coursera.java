import java.util.ArrayList;
import java.util.List;

public class Coursera {

    private List<Registracija> registracije;
    private List<Obuka> obuke;

    private static Coursera instance;

    private Coursera() {
        this.obuke = new ArrayList<>();
        this.registracije = new ArrayList<>();
    }

    public static Coursera getInstance() {
        if(instance == null) {
            instance = new Coursera();
        }

        return instance;

    }

    public void sveObukePolaznika(Polaznik polaznik) {

    }

    public boolean dodajRegistraciju(Registracija registracija) {
        return false;
    }

    public List<Registracija> getRegistracije() {
        return registracije;
    }

    public void setRegistracije(List<Registracija> registracije) {
        this.registracije = registracije;
    }

    public List<Obuka> getObuke() {
        return obuke;
    }

    public void setObuke(List<Obuka> obuke) {
        this.obuke = obuke;
    }
}
