package app.model;

import java.util.Objects;

public class Pitanje {
    private String oznakaPitanja;
    private String termin;
    private double maxPoena;

    public Pitanje(String oznakaPitanja, String termin, double maxPoena) {
        this.oznakaPitanja = oznakaPitanja;
        this.termin = termin;
        this.maxPoena = maxPoena;
    }

    public String getOznakaPitanja() {
        return oznakaPitanja;
    }

    public void setOznakaPitanja(String oznakaPitanja) {
        this.oznakaPitanja = oznakaPitanja;
    }

    public String getTermin() {
        return termin;
    }

    public void setTermin(String termin) {
        this.termin = termin;
    }

    public double getMaxPoena() {
        return maxPoena;
    }

    public void setMaxPoena(double maxPoena) {
        this.maxPoena = maxPoena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pitanje pitanje = (Pitanje) o;
        return Double.compare(maxPoena, pitanje.maxPoena) == 0 && Objects.equals(oznakaPitanja, pitanje.oznakaPitanja) && Objects.equals(termin, pitanje.termin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oznakaPitanja, termin, maxPoena);
    }

    @Override
    public String toString() {
        return "Pitanje{" +
                "oznakaPitanja='" + oznakaPitanja + '\'' +
                ", termin='" + termin + '\'' +
                ", maxPoena=" + maxPoena +
                '}';
    }
}
