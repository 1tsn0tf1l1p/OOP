import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.RecursiveTask;

public class Polaznik implements Registracija{

    private String ime;
    private String prezime;
    private String email;
    private List<Obuka> obuke;

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

    public List<Obuka> getObuke() {
        return obuke;
    }

    public void setObuke(List<Obuka> obuke) {
        this.obuke = obuke;
    }

    @Override
    public boolean registruj(Obuka obuka) {
        if(!((this.email != null) && this.email.contains("@"))) {
            return false;
        }
        if(obuke.contains(obuka)) {
            return false;
        }
        if(obuka instanceof Kurs) {
            if(((Kurs) obuka).getPreduslovi().containsAll(this.obuke)) {
                this.obuke.add(obuka);
                return true;
            }else {
                return false;
            }
        }
        if(obuka instanceof Projekat) {
            if(((Projekat) obuka).getMaksimalanBrojPolaznika()<obuka.getMinimalanBrojPolaznika()) {
                this.obuke.add(obuka);
                return true;
            }
            else {
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean registrovan(Obuka obuka) {
        if(this.obuke.contains(obuka)) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return this.ime + " " + this.prezime + "[" + this.email + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polaznik polaznik = (Polaznik) o;
        return Objects.equals(ime, polaznik.ime) && Objects.equals(prezime, polaznik.prezime) && Objects.equals(email, polaznik.email) && Objects.equals(obuke, polaznik.obuke);
    }


}
