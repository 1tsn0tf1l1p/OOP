package paket2;

public class Kupovina {

    private int kolicina;
    private Proizvod proizvod;
    private Zaposleni zaposleni;

    public Kupovina(int kolicina, Proizvod proizvod, Zaposleni zaposleni) {
        this.kolicina = kolicina;
        this.proizvod = proizvod;
        this.zaposleni = zaposleni;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    @Override
    public String toString() {
        return "Kupovina{" +
                "kolicina=" + kolicina +
                ", proizvod=" + proizvod +
                ", zaposleni=" + zaposleni +
                '}';
    }
}
