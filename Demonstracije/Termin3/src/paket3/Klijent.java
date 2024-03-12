package paket3;

public class Klijent {

    private String ime;
    private String prezime;
    private String lozinka;
    private Racun racun;

    public Klijent(String ime, String prezime, String lozinka) {
        this.ime = ime;
        this.prezime = prezime;
        this.lozinka = lozinka;
    }

    public String getIme(){
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

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }
}
