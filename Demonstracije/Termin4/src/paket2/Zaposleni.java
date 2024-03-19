package paket2;

public class Zaposleni extends Osoba{

    private Pozicija pozicija;

    public Zaposleni(String ime, String prezime, String jmbg, Pozicija pozicija) {
        super(ime, prezime, jmbg);
        this.pozicija = pozicija;
    }

    public Pozicija getPozicija() {
        return pozicija;
    }

    public void setPozicija(Pozicija pozicija) {
        this.pozicija = pozicija;
    }

    @Override
    public String toString() {
        return "Zaposleni{" +
                "pozicija=" + pozicija +
                '}';
    }


}
