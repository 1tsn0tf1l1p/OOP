import java.util.Objects;

public abstract class Aktivnost {

    private String naziv;
    private double minimum;
    private double maksimum;
    private Smer smer;

    public Aktivnost(String naziv, Smer smer, double minimum, double maksimum) {
        this.naziv = naziv;
        this.smer = smer;
        this.maksimum = maksimum;
        this.minimum = minimum;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getMinimum() {
        return minimum;
    }

    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }

    public double getMaksimum() {
        return maksimum;
    }

    public void setMaksimum(double maksimum) {
        this.maksimum = maksimum;
    }

    public Smer getSmer() {
        return smer;
    }

    public void setSmer(Smer smer) {
        this.smer = smer;
    }

    public abstract int izracunajOcenu(double brojPoena);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aktivnost aktivnost = (Aktivnost) o;
        return Objects.equals(naziv, aktivnost.naziv) && smer == aktivnost.smer;
    }

    @Override
    public String toString() {
        return this.naziv;
    }
}
