import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klasa implements ImaProsek{

    private int razred;
    private int odeljenje;
    private String razredniStaresina;
    private List<Ucenik> ucenici;
    private Smer smer;

    public Klasa(Smer smer, int razred, int odeljenje, String razredniStaresina) {
        this.smer = smer;
        this.razred = razred;
        this.odeljenje = odeljenje;
        this.razredniStaresina = razredniStaresina;
        this.ucenici = new ArrayList<>();
    }

    public int getRazred() {
        return razred;
    }

    public void setRazred(int razred) {
        this.razred = razred;
    }

    public int getOdeljenje() {
        return odeljenje;
    }

    public void setOdeljenje(int odeljenje) {
        this.odeljenje = odeljenje;
    }

    public String getRazredniStaresina() {
        return razredniStaresina;
    }

    public void setRazredniStaresina(String razredniStaresina) {
        this.razredniStaresina = razredniStaresina;
    }

    public List<Ucenik> getUcenici() {
        return ucenici;
    }

    public void setUcenici(List<Ucenik> ucenici) {
        this.ucenici = ucenici;
    }

    public Smer getSmer() {
        return smer;
    }

    public void setSmer(Smer smer) {
        this.smer = smer;
    }

    @Override
    public double prosek() {

        double zbir = 0;
        int cnt = 0;

        for (Ucenik ucenik : ucenici) {
            zbir = zbir + ucenik.getBeleske().size();
            cnt++;
        }

        return (zbir/cnt);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klasa klasa = (Klasa) o;
        return razred == klasa.razred && odeljenje == klasa.odeljenje && smer == klasa.smer;
    }

}
