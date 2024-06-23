package app.model;

import java.time.LocalDate;
import java.util.Locale;

public class KursTabela {
    private String naziv;
    private String kategorija;
    private LocalDate pocetakDatum;
    private String pocetakVreme;
    private LocalDate kraj;
    private String krajVreme;
    private double kompletiranost;

    public KursTabela(String naziv, String kategorija, LocalDate pocetakDatum, String pocetakVreme, LocalDate kraj, String krajVreme, double kompletiranost) {
        this.naziv = naziv;
        this.kategorija = kategorija;
        this.pocetakDatum = pocetakDatum;
        this.pocetakVreme = pocetakVreme;
        this.kraj = kraj;
        this.krajVreme = krajVreme;
        this.kompletiranost = kompletiranost;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public LocalDate getPocetakDatum() {
        return pocetakDatum;
    }

    public void setPocetakDatum(LocalDate pocetakDatum) {
        this.pocetakDatum = pocetakDatum;
    }

    public String getPocetakVreme() {
        return pocetakVreme;
    }

    public void setPocetakVreme(String pocetakVreme) {
        this.pocetakVreme = pocetakVreme;
    }

    public LocalDate getKraj() {
        return kraj;
    }

    public void setKraj(LocalDate kraj) {
        this.kraj = kraj;
    }

    public String getKrajVreme() {
        return krajVreme;
    }

    public void setKrajVreme(String krajVreme) {
        this.krajVreme = krajVreme;
    }

    public double getKompletiranost() {
        return kompletiranost;
    }

    public void setKompletiranost(double kompletiranost) {
        this.kompletiranost = kompletiranost;
    }
}
