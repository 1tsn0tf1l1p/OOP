public abstract class Aktivnost {

    private String naziv;
    private double minimum;
    private double maksimum;
    private Smer smer;

    public Aktivnost(String naziv, Smer smer, double maksimum, double minimum) {
        this.naziv = naziv;
        this.smer = smer;
        this.maksimum = maksimum;
        this.minimum = minimum;
    }

    public abstract int izracunajOcenu(double poeni);

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
}
