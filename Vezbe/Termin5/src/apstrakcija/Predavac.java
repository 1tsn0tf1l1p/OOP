package apstrakcija;

public abstract class Predavac extends Zaposljeni {


    private String predmet;

    public Predavac(String ime, String prezime, int godia, String predmet) {
        super(ime, prezime, godia);
        this.predmet = predmet;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }
}
