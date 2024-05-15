package app.model;

import java.util.ArrayList;
import java.util.List;

public class Baza {

    private static Baza instance = null;

    private List<Korisnik> registrovaniKorisnici;
    private List<Korisnik> ulogovaniKorisnici;

    private Baza() {
        registrovaniKorisnici = new ArrayList<>();
        ulogovaniKorisnici = new ArrayList<>();
    }

    public  static Baza getInstance() {
        if (instance == null) {
            instance = new Baza();
        }
        return instance;
    }

    public void dodajKorisnikaUUlogovaneKorisnike(Korisnik korisnik) {
        if(registrovaniKorisnici.contains(korisnik) && !ulogovaniKorisnici.contains(korisnik)) {
            ulogovaniKorisnici.add(korisnik);
        }
        else {

        }
    }

    public List<Korisnik> getRegistrovaniKorisnici() {
        return registrovaniKorisnici;
    }

    public void setRegistrovaniKorisnici(List<Korisnik> registrovaniKorisnici) {
        this.registrovaniKorisnici = registrovaniKorisnici;
    }

    public List<Korisnik> getUlogovaniKorisnici() {
        return ulogovaniKorisnici;
    }

    public void setUlogovaniKorisnici(List<Korisnik> ulogovaniKorisnici) {
        this.ulogovaniKorisnici = ulogovaniKorisnici;
    }
}
