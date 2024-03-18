package nasledjivanje;

public class Zaposljeni {

    private String ime;
    private String prezime;
    private int godinaRada;

    public Zaposljeni(String ime, String prezime, int godinaRada) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRada = godinaRada;
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

    public int getGodinaRada() {
        return godinaRada;
    }

    public void setGodinaRada(int godinaRada) {
        this.godinaRada = godinaRada;
    }
}
