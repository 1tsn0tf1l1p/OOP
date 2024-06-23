package app.model;

import java.util.Objects;

public class PitanjeStatistika {
    private String oznakaPitanja;
    private Double maxOcena;
    private Double prosek;
    private Double procenatMax;

    public PitanjeStatistika(String oznakaPitanja, Double maxOcena, Double prosek, Double procenatMax) {
        this.oznakaPitanja = oznakaPitanja;
        this.maxOcena = maxOcena;
        this.prosek = prosek;
        this.procenatMax = procenatMax;
    }

    public String getOznakaPitanja() {
        return oznakaPitanja;
    }

    public void setOznakaPitanja(String oznakaPitanja) {
        this.oznakaPitanja = oznakaPitanja;
    }

    public Double getMaxOcena() {
        return maxOcena;
    }

    public void setMaxOcena(Double maxOcena) {
        this.maxOcena = maxOcena;
    }

    public Double getProsek() {
        return prosek;
    }

    public void setProsek(Double prosek) {
        this.prosek = prosek;
    }

    public Double getProcenatMax() {
        return procenatMax;
    }

    public void setProcenatMax(Double procenatMax) {
        this.procenatMax = procenatMax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PitanjeStatistika that = (PitanjeStatistika) o;
        return Objects.equals(oznakaPitanja, that.oznakaPitanja) && Objects.equals(maxOcena, that.maxOcena) && Objects.equals(prosek, that.prosek) && Objects.equals(procenatMax, that.procenatMax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oznakaPitanja, maxOcena, prosek, procenatMax);
    }

    @Override
    public String toString() {
        return "PitanjeStatistika{" +
                "oznakaPitanja='" + oznakaPitanja + '\'' +
                ", maxOcena=" + maxOcena +
                ", prosek=" + prosek +
                ", procenatMax=" + procenatMax +
                '}';
    }
}
