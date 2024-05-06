import java.util.Objects;

public class Korisnik {

    private String prikaznoIme;
    private String korisnickoIme;
    private String lozinka;

    public Korisnik(String prikaznoIme, String korisnickoIme, String lozinka) {
        this.prikaznoIme = prikaznoIme;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }

    public String getPrikaznoIme() {
        return prikaznoIme;
    }

    public void setPrikaznoIme(String prikaznoIme) {
        this.prikaznoIme = prikaznoIme;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public void napisiPoruku(Chat chat, String s) {

        if(chat.mozeNapisatiPoruku(this)) {
            chat.dodajPoruku(this, s);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Korisnik korisnik = (Korisnik) o;
        return Objects.equals(prikaznoIme, korisnik.prikaznoIme) && Objects.equals(korisnickoIme, korisnik.korisnickoIme) && Objects.equals(lozinka, korisnik.lozinka);
    }

}
