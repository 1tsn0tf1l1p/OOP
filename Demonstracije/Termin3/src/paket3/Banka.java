package paket3;

import java.util.ArrayList;

public class Banka {

    private String naziv;
    private String lokacija;
    private ArrayList<Klijent> listaKlijenata;

    public Banka(String naziv, String lokacija) {
        this.naziv = naziv;
        this.lokacija = lokacija;
        this.listaKlijenata = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getLokacija() {
        return lokacija;
    }

    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }

    public ArrayList<Klijent> getListaKlijenata() {
        return listaKlijenata;
    }

    public void setListaKlijenata(ArrayList<Klijent> listaKlijenata) {
        this.listaKlijenata = listaKlijenata;
    }

    public void dodajKlijenta(Klijent k) {
        this.listaKlijenata.add(k);
    }
}

