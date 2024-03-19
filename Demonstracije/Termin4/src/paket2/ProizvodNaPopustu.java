package paket2;

public class ProizvodNaPopustu extends Proizvod{

    private double popust;

    public ProizvodNaPopustu(String naziv, String sifra, double cena, int stanje, double popust) {
        super(naziv, sifra, cena, stanje);
        this.popust = popust;
    }

    public ProizvodNaPopustu(String naziv, String sifra, double cena, int stanje, TipProizvoda tip, double popust) {
        super(naziv, sifra, cena, stanje, tip);
        this.popust = popust;
    }

    @Override
    public double cenaPoKolicini(int kolicina) {
        return 0;
    }

    public void obavestenje() {

    }

    @Override
    public String toString() {
        return "ProizvodNaPopustu{" +
                "popust=" + popust +
                '}';
    }
}
