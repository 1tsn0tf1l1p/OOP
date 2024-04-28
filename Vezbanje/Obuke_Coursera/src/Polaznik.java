import java.util.ArrayList;
import java.util.List;

public class Polaznik implements Registracija{

    private String ime;
    private String prezime;
    private String email;
    private List<ObukaPolaznika> obuke;

    public Polaznik(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.obuke = new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ObukaPolaznika> getObuke() {
        return obuke;
    }

    public void setObuke(List<ObukaPolaznika> obuke) {
        this.obuke = obuke;
    }

    @Override
    public boolean registruj(Obuka obuka) {

        if(this.email == null) {
            return false;
        }
        if(!this.email.contains("@")) {
            return false;
        }
        if(this.getObuke().contains(obuka)) {
            return false;
        }
        if(obuka instanceof Kurs) {
            if(this.getObuke().containsAll(((Kurs) obuka).getPreduslovi())) {
                ObukaPolaznika obukaPolaznika = new ObukaPolaznika(this);
                this.getObuke().add(obukaPolaznika);
                return true;
            }
        }
        if(obuka instanceof Projekat) {
            if(((Projekat) obuka).getMaksimalanBrojPolaznika() > obuka.getMinimalanBrojPolaznika()) {
                ObukaPolaznika obukaPolaznika = new ObukaPolaznika(this);
                this.getObuke().add(obukaPolaznika);
                return true;
            }
        }

        return true;

    }

    @Override
    public boolean registrovan(Obuka obuka) {
        return false;
    }

    @Override
    public String toString() {
        return this.ime + " " + this.prezime + " [" + this.email + "] ";
    }
}
