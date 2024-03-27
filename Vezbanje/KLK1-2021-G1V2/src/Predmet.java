import java.util.ArrayList;
import java.util.List;

public class Predmet {

    private String naziv;
    private int semestar;
    private int espb;
    private OznakaPlana oznakaPlana;
    private List<Predmet> preduslovi;

    public Predmet(String naziv, int semestar, int espb, OznakaPlana oznakaPlana, List<Predmet> preduslovi) {
        this.naziv = naziv;
        this.semestar = semestar;
        this.espb = espb;
        this.oznakaPlana = oznakaPlana;
        this.preduslovi = new ArrayList<>();
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

    public void dodajPreduslov(Predmet predmet) {
        if(predmet.getOznakaPlana() == this.getOznakaPlana() && predmet.semestar < this.semestar) {
            this.preduslovi.add(predmet);
        }
        else {
            System.out.println("Nije moguce dodati preduslov!");
        }
    }
}
