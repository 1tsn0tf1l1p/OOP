import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Biblioteka {

    private String naziv;
    private List<Knjizevnost> knjige;

    public Biblioteka(String naziv) {
        this.naziv = naziv;
        this.knjige = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Knjizevnost> getKnjige() {
        return knjige;
    }

    public void setKnjige(List<Knjizevnost> knjige) {
        this.knjige = knjige;
    }

    public void dodajKnjigu(Knjizevnost knjizevnost) {
        this.getKnjige().add(knjizevnost);
    }

    public void sortirajKnjige() {

        Collections.sort(knjige);

    }

    public void ispisSvihKnjiga() {

        sortirajKnjige();

        System.out.println("Knjige na raspolaganju u biblioteci "+getNaziv()+":");

        for(Knjizevnost k:knjige) {
            System.out.println(k.toString());
        }

    }

    public Pisac najcitanijiPisac() {

        for(Knjizevnost k:knjige) {
            if(k instanceof AutorskaKnjizevnost) {

            }
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteka that = (Biblioteka) o;
        return Objects.equals(naziv, that.naziv) && Objects.equals(knjige, that.knjige);
    }

}
