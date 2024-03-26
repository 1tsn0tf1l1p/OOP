package apstrakcija;

public class Zaposljeni {

    private String ime;
    private String prezime;
    private int godia;

    public Zaposljeni(String ime, String prezime, int godia) {
        this.ime = ime;
        this.prezime = prezime;
        this.godia = godia;
    }


    public void prijaviDolazak() {
        System.out.println(this.ime + this.prezime);
    }



    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodia() {
        return godia;
    }

    public void setGodia(int godia) {
        this.godia = godia;
    }
}
