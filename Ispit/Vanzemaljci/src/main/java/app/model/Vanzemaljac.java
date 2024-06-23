package app.model;

import java.util.Objects;

public class Vanzemaljac implements Comparable<Vanzemaljac>{
    private int id;
    private boolean pronadjen;
    private String drzava;
    private String kontinent;

    public Vanzemaljac(int id, boolean pronadjen, String drzava, String kontinent) {
        this.id = id;
        this.pronadjen = pronadjen;
        this.drzava = drzava;
        this.kontinent = kontinent;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPronadjen() {
        return pronadjen;
    }

    public void setPronadjen(boolean pronadjen) {
        this.pronadjen = pronadjen;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getKontinent() {
        return kontinent;
    }

    public void setKontinent(String kontinent) {
        this.kontinent = kontinent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vanzemaljac that = (Vanzemaljac) o;
        return id == that.id && pronadjen == that.pronadjen && Objects.equals(drzava, that.drzava) && Objects.equals(kontinent, that.kontinent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pronadjen, drzava, kontinent);
    }

    @Override
    public int compareTo(Vanzemaljac o) {
        if(this.id < o.id) {
            return -1;
        }
        else if(this.id > o.id) {
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Vanzemaljac{" +
                "id=" + id +
                ", pronadjen=" + pronadjen +
                ", drzava='" + drzava + '\'' +
                ", kontinent='" + kontinent + '\'' +
                '}';
    }
}
