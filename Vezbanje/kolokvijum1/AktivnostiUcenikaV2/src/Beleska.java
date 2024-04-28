import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

public class Beleska implements Comparable<Beleska> {

    private int trajanje;
    private String opis;
    private double brojPoena;
    private Ucenik ucenik;
    private Aktivnost aktivnost;
    private LocalDate datum;

    public Beleska(Ucenik ucenik, Aktivnost aktivnost, int trajanje, String opis, double brojPoena, LocalDate datum) {
        this.ucenik = ucenik;
        this.aktivnost = aktivnost;
        this.trajanje = trajanje;
        this.opis = opis;
        this.brojPoena = brojPoena;
        this.datum = datum;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(double brojPoena) {
        this.brojPoena = brojPoena;
    }

    public Ucenik getUcenik() {
        return ucenik;
    }

    public void setUcenik(Ucenik ucenik) {
        this.ucenik = ucenik;
    }

    public Aktivnost getAktivnost() {
        return aktivnost;
    }

    public void setAktivnost(Aktivnost aktivnost) {
        this.aktivnost = aktivnost;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beleska beleska = (Beleska) o;
        return trajanje == beleska.trajanje && Double.compare(brojPoena, beleska.brojPoena) == 0 && Objects.equals(opis, beleska.opis) && Objects.equals(ucenik, beleska.ucenik) && Objects.equals(aktivnost, beleska.aktivnost);
    }

    @Override
    public int compareTo(Beleska o) {

        if(this.datum.isAfter(o.datum)) {
            return 1;
        }
        else if(this.datum.isBefore(o.datum)) {
            return -1;
        }
        else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return this.datum.getDayOfMonth() + "." + this.datum.getMonth() + "." + this.datum.getYear()
                + " - " + this.getAktivnost().toString() + " - " + this.brojPoena +
                " (" + this.aktivnost.izracunajOcenu(this.brojPoena) + ")";
    }
}
