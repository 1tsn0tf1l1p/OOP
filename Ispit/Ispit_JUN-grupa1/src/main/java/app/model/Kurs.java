package app.model;

import java.util.Objects;

public class Kurs {
    private String naziv;
    private String kategorija;
    private Integer trajanje;
    private String cena;

    public Kurs(String naziv, String kategorija, Integer trajanje, String cena) {
        this.naziv = naziv;
        this.kategorija = kategorija;
        this.trajanje = trajanje;
        this.cena = cena;
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

    public Integer getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(Integer trajanje) {
        this.trajanje = trajanje;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return this.kategorija + ", " + this.naziv + ", Trajanje: " + this.trajanje + " min, " + this.cena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kurs kurs = (Kurs) o;
        return Objects.equals(naziv, kurs.naziv) && Objects.equals(kategorija, kurs.kategorija) && Objects.equals(trajanje, kurs.trajanje) && Objects.equals(cena, kurs.cena);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naziv, kategorija, trajanje, cena);
    }
}
