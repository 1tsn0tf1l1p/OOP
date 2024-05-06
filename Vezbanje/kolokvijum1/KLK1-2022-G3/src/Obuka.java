import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Obuka implements Comparable<Obuka>{

    private String naziv;
    private int minimalanBrojPolaznika;
    private List<Profesor> predavaci;
    private Oblast oblast;
    private List<ObukaPolaznika> obukaPolaznika;

    public Obuka(String naziv, int minimalanBrojPolaznika, Oblast oblast) {
        this.naziv = naziv;
        this.minimalanBrojPolaznika = minimalanBrojPolaznika;
        this.oblast = oblast;
        this.predavaci = new ArrayList<>();
        this.obukaPolaznika = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getMinimalanBrojPolaznika() {
        return minimalanBrojPolaznika;
    }

    public void setMinimalanBrojPolaznika(int minimalanBrojPolaznika) {
        this.minimalanBrojPolaznika = minimalanBrojPolaznika;
    }

    public List<Profesor> getPredavaci() {
        return predavaci;
    }

    public void setPredavaci(List<Profesor> predavaci) {
        this.predavaci = predavaci;
    }

    public Oblast getOblast() {
        return oblast;
    }

    public void setOblast(Oblast oblast) {
        this.oblast = oblast;
    }

    public List<ObukaPolaznika> getObukaPolaznika() {
        return obukaPolaznika;
    }

    public void setObukaPolaznika(List<ObukaPolaznika> obukaPolaznika) {
        this.obukaPolaznika = obukaPolaznika;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obuka obuka = (Obuka) o;
        return minimalanBrojPolaznika == obuka.minimalanBrojPolaznika && Objects.equals(naziv, obuka.naziv) && Objects.equals(predavaci, obuka.predavaci) && oblast == obuka.oblast && Objects.equals(obukaPolaznika, obuka.obukaPolaznika);
    }

    @Override
    public int compareTo(Obuka o) {

      return 0;

    }
}
