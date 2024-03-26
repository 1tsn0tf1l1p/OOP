package apstrakcija;

public class Pravnik extends Zaposljeni {

    private String papirologija;

    public Pravnik(String ime, String prezime, int godia, String papirologija) {
        super(ime, prezime, godia);
        this.papirologija = papirologija;
    }

    public String getPapirologija() {
        return papirologija;
    }

    public void setPapirologija(String papirologija) {
        this.papirologija = papirologija;
    }
}
