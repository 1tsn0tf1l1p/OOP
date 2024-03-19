package paket2;

import java.util.Objects;

public class Proizvod {

    private String naziv;
    private String sifra;
    private double cena;
    private int stanje;
    private TipProizvoda tip;

    public Proizvod(String naziv, String sifra, double cena, int stanje) {
        this.naziv = naziv;
        this.sifra = sifra;
        this.cena = cena;
        this.stanje = stanje;
    }

    public Proizvod(String naziv, String sifra, double cena, int stanje, TipProizvoda tip) {
        this.naziv = naziv;
        this.sifra = sifra;
        this.cena = cena;
        this.stanje = stanje;
        this.tip = tip;
    }

    public boolean naStanju(int kolicina) {
        return true;
    }

    public void umanjiKolicinu(int kolicina) {

    }

    public double cenaPoKolicini(int kolicina) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proizvod proizvod = (Proizvod) o;
        return Double.compare(cena, proizvod.cena) == 0 && stanje == proizvod.stanje && Objects.equals(naziv, proizvod.naziv) && Objects.equals(sifra, proizvod.sifra) && tip == proizvod.tip;
    }

    @Override
    public String toString() {
        return "Proizvod{" +
                "naziv='" + naziv + '\'' +
                ", sifra='" + sifra + '\'' +
                ", cena=" + cena +
                ", stanje=" + stanje +
                ", tip=" + tip +
                '}';
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getStanje() {
        return stanje;
    }

    public void setStanje(int stanje) {
        this.stanje = stanje;
    }

    public TipProizvoda getTip() {
        return tip;
    }

    public void setTip(TipProizvoda tip) {
        this.tip = tip;
    }
}
