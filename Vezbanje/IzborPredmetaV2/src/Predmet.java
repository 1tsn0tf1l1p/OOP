import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Predmet {

    private String naziv;
    private int semestar;
    private int espb;
    private OznakaPlana oznakaPlana;
    private List<Predmet> preduslovi;

    public Predmet(String naziv, int semestar, OznakaPlana oznakaPlana, int espb) {
        this.naziv = naziv;
        this.semestar = semestar;
        this.oznakaPlana = oznakaPlana;
        this.espb = espb;
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
        if(!(this.getOznakaPlana() == predmet.getOznakaPlana())) {
            return;
        }
        if(predmet.getSemestar() > this.getSemestar()) {
            return;
        }

        this.preduslovi.add(predmet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predmet predmet = (Predmet) o;
        return semestar == predmet.semestar && espb == predmet.espb && Objects.equals(naziv, predmet.naziv) && oznakaPlana == predmet.oznakaPlana && Objects.equals(preduslovi, predmet.preduslovi);
    }

}
