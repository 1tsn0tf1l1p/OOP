public class Plesac extends Ucesnik{

    private String uloga;
    private Velicina velicina;


    public Plesac(String ime, Velicina velicina, Boolean bool) {
        super(ime);
    }

    public String getUloga() {
        return uloga;
    }

    public void setUloga(String uloga) {
        this.uloga = uloga;
    }

    public Velicina getVelicina() {
        return velicina;
    }

    public void setVelicina(Velicina velicina) {
        this.velicina = velicina;
    }

    @Override
    public String toString() {
        return "Plesac{" +
                "uloga='" + uloga + '\'' +
                ", velicina=" + velicina +
                '}';
    }


}
