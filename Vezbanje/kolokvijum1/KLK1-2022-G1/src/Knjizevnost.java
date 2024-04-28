import java.util.Comparator;
import java.util.Objects;

public abstract class Knjizevnost implements Comparable<Knjizevnost> {

    private String naziv;
    private TipKnjizevnosti tipKnjizevnosti;

    public Knjizevnost(String naziv, TipKnjizevnosti tipKnjizevnosti) {
        this.naziv = naziv;
        this.tipKnjizevnosti = tipKnjizevnosti;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public TipKnjizevnosti getTipKnjizevnosti() {
        return tipKnjizevnosti;
    }

    public void setTipKnjizevnosti(TipKnjizevnosti tipKnjizevnosti) {
        this.tipKnjizevnosti = tipKnjizevnosti;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knjizevnost that = (Knjizevnost) o;
        return Objects.equals(naziv, that.naziv) && tipKnjizevnosti == that.tipKnjizevnosti;
    }

}
