import java.util.ArrayList;
import java.util.List;

public abstract class Obuka implements Comparable<Obuka>{

    private String naziv;
    private int minimalanBrojPolaznika;
    private Oblast oblast;
    private List<Profesor> predavaci;
    private List<ObukaPolaznika> obukePolaznika;

    public Obuka(String naziv, Oblast oblast, int minimalanBrojPolaznika) {
        this.naziv = naziv;
        this.oblast = oblast;
        this.minimalanBrojPolaznika = minimalanBrojPolaznika;
        this.predavaci = new ArrayList<>();
        this.obukePolaznika = new ArrayList<>();
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

    public Oblast getOblast() {
        return oblast;
    }

    public void setOblast(Oblast oblast) {
        this.oblast = oblast;
    }

    public List<Profesor> getPredavaci() {
        return predavaci;
    }

    public void setPredavaci(List<Profesor> predavaci) {
        this.predavaci = predavaci;
    }

    public List<ObukaPolaznika> getObukePolaznika() {
        return obukePolaznika;
    }

    public void setObukePolaznika(List<ObukaPolaznika> obukePolaznika) {
        this.obukePolaznika = obukePolaznika;
    }

    @Override
    public int compareTo(Obuka o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Obuka{" +
                "naziv='" + naziv + '\'' +
                ", minimalanBrojPolaznika=" + minimalanBrojPolaznika +
                ", oblast=" + oblast +
                ", predavaci=" + predavaci +
                ", obukePolaznika=" + obukePolaznika +
                '}';
    }
}
