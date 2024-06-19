package app.model;

import java.time.LocalDate;

public class Transakcija {
    private TipTransakcije tipTransakcije;
    private int iznos;
    private String uplatilacPrimalac;
    private LocalDate datum;
    private String Kategorija;

    public Transakcija(TipTransakcije tipTransakcije, int iznos, String uplatilacPrimalac, LocalDate datum, String kategorija) {
        this.tipTransakcije = tipTransakcije;
        this.iznos = iznos;
        this.uplatilacPrimalac = uplatilacPrimalac;
        this.datum = datum;
        Kategorija = kategorija;
    }

    public Transakcija(TipTransakcije tipTransakcije, int iznos, String uplatilacPrimalac, LocalDate datum) {
        this.tipTransakcije = tipTransakcije;
        this.iznos = iznos;
        this.uplatilacPrimalac = uplatilacPrimalac;
        this.datum = datum;
    }

    public TipTransakcije getTipTransakcije() {
        return tipTransakcije;
    }

    public void setTipTransakcije(TipTransakcije tipTransakcije) {
        this.tipTransakcije = tipTransakcije;
    }

    public int getIznos() {
        return iznos;
    }

    public void setIznos(int iznos) {
        this.iznos = iznos;
    }

    public String getUplatilacPrimalac() {
        return uplatilacPrimalac;
    }

    public void setUplatilacPrimalac(String uplatilacPrimalac) {
        this.uplatilacPrimalac = uplatilacPrimalac;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public String getKategorija() {
        return Kategorija;
    }

    public void setKategorija(String kategorija) {
        Kategorija = kategorija;
    }

    @Override
    public String toString() {
        return this.tipTransakcije + " " + this.iznos + " " + this.datum;
    }
}
