import java.util.ArrayList;
import java.util.List;
public class Coursera {

    private List<Registracija> registracije = new ArrayList<>();
    private List<Obuka> obuke = new ArrayList<>();

    private static Coursera instance = null;
    private Coursera() {}

    public static Coursera getInstance() {
        if(instance == null) {
            instance = new Coursera();
        }
        return instance;
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

    public void sveObukePolaznika(Polaznik polaznik) {
        for(Obuka obuka:polaznik.getObuke()) {
            System.out.println(obuka.toString());
        }
    }

    public boolean dodajRegistraciju(Registracija registracija) {
        // TODO
        return false;
    }

}
