import java.util.List;

public class PlesnaNumera implements Izvodjenje{

    private String naziv;
    private List<Ucesnik> ucesnici;

    public PlesnaNumera() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Ucesnik> getUcesnici() {
        return ucesnici;
    }

    public void setUcesnici(List<Ucesnik> ucesnici) {
        this.ucesnici = ucesnici;
    }


    @Override
    public void dodajUcesnika(Ucesnik ucesnik) {

    }

    @Override
    public boolean jeMoguceIzvesti() {
        return false;
    }

    @Override
    public void izvedi() {

    }

    private void ispisiUcesnike() {
        // TODO
    }

    public boolean proveriKostime(List<Kostim> kostimi) {
        // TODO
        return false;
    }

}
