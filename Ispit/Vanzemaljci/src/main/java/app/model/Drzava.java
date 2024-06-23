package app.model;

import java.util.Objects;

public class Drzava {
    private String drzavaIme;
    private String kontinentIme;

    public Drzava(String drzavaIme, String kontinentIme) {
        this.drzavaIme = drzavaIme;
        this.kontinentIme = kontinentIme;
    }

    public String getDrzavaIme() {
        return drzavaIme;
    }

    public void setDrzavaIme(String drzavaIme) {
        this.drzavaIme = drzavaIme;
    }

    public String getKontinentIme() {
        return kontinentIme;
    }

    public void setKontinentIme(String kontinentIme) {
        this.kontinentIme = kontinentIme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drzava drzava = (Drzava) o;
        return Objects.equals(drzavaIme, drzava.drzavaIme) && Objects.equals(kontinentIme, drzava.kontinentIme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drzavaIme, kontinentIme);
    }

    @Override
    public String toString() {
        return "Drzava{" +
                "drzavaIme='" + drzavaIme + '\'' +
                ", kontinentIme='" + kontinentIme + '\'' +
                '}';
    }
}
