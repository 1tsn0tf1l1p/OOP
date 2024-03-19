package paket2;

import java.util.ArrayList;

public class Prodavnica {

    private String naziv;
    private double zarada;
    private ArrayList<Proizvod> proizvodi = new ArrayList<>();
    private ArrayList<Kupovina> kupovine = new ArrayList<>();
    private ArrayList<Zaposleni> radnici = new ArrayList<>();
    private Zaposleni trenutniRadnik;

    public Prodavnica(String naziv) {
        this.naziv = naziv;
    }

    public void dodajProizvod(Proizvod p) {

        if(proizvodi.contains(p)==false) {
            proizvodi.add(p);
        }

    }

    public void zaposliRadnika(Zaposleni z) {

        if(radnici.contains(z)==false){
            if(z.getPozicija().equals(Pozicija.RADNIK)){
                radnici.add(z);
            }
        }

    }

    public void postaviTrenutnogRadnika(Zaposleni z) {

        this.trenutniRadnik = z;

    }

    public void postaviTrenutnogRadnika(String jmng) {

        for(Zaposleni z:radnici) {
            if(z.getJmbg().equals(jmng)){
                this.trenutniRadnik = z;
            }
        }

    }

    public void kupiProizvod(String sifra, int kolicina) {

        for(Proizvod p:proizvodi) {
            if(p.getSifra().equals(sifra) && p.naStanju(kolicina)){
                p.umanjiKolicinu(kolicina);
                this.zarada= this.zarada + p.cenaPoKolicini(kolicina);
                Kupovina k = new Kupovina(kolicina, p, trenutniRadnik);
                this.kupovine.add(k);
            }
        }

    }

    public Proizvod vratiProizvod(String sifra) {
        return null;
    }

    public void ispisiObavestenjaPopusta() {

    }

    public void ispisiProizvode(){

    }

    public void ispisiKupovine(){

    }

    public void ispisiRadnike(){

    }

    public int kolicinaProdatogProizvoda(String sifra) {
        return 1;
    }

    @Override
    public String toString() {
        return "Prodavnica{" +
                "naziv='" + naziv + '\'' +
                ", zarada=" + zarada +
                ", proizvodi=" + proizvodi +
                ", kupovine=" + kupovine +
                ", radnici=" + radnici +
                ", trenutniRadnik=" + trenutniRadnik +
                '}';
    }
}
