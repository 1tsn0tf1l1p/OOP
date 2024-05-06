import java.util.ArrayList;
import java.util.List;

public class Predmet {

    private String naziv;
    private int semestar;
    private int espb;
    private OznakaPlana oznakaPlana;
    private List<Predmet> preduslovi;

    public Predmet(String naziv, int semestar, int espb, OznakaPlana oznakaPlana) {
        this.naziv = naziv;
        this.semestar = semestar;
        this.espb = espb;
        this.oznakaPlana = oznakaPlana;
        this.preduslovi = new ArrayList<>();
    }

    public void dodajPreduslov(Predmet predmet) {

        if((this.getOznakaPlana() == predmet.getOznakaPlana()) && (this.getSemestar()>predmet.getSemestar())) {
            this.preduslovi.add(predmet);
            System.out.println("Predmet uspesno dodat u preduslove!");
        }else {
            System.out.println("Predmet nije dodat u preduslove...");
        }

    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getSemestar() {
        return semestar;
    }

    public void setSemestar(int semestar) {
        this.semestar = semestar;
    }

    public int getEspb() {
        return espb;
    }

    public void setEspb(int espb) {
        this.espb = espb;
    }

    public OznakaPlana getOznakaPlana() {
        return oznakaPlana;
    }

    public void setOznakaPlana(OznakaPlana oznakaPlana) {
        this.oznakaPlana = oznakaPlana;
    }

    public List<Predmet> getPreduslovi() {
        return preduslovi;
    }

    public void setPreduslovi(List<Predmet> preduslovi) {
        this.preduslovi = preduslovi;
    }
}
