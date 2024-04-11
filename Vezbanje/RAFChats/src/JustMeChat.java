import java.util.ArrayList;
import java.util.List;

public class JustMeChat implements Chat{

    private Korisnik korisnik;
    private List<String> poruke;

    public JustMeChat(Korisnik korisnik) {
        this.korisnik = korisnik;
        this.poruke = new ArrayList<>();
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public List<String> getPoruke() {
        return poruke;
    }

    public void setPoruke(List<String> poruke) {
        this.poruke = poruke;
    }

    @Override
    public boolean mozeNapisatiPoruku(Korisnik korisnik) {
        return this.korisnik.equals(korisnik);
    }

    @Override
    public void dodajPoruku(Korisnik korisnik, String poruka) {

        if(this.mozeNapisatiPoruku(korisnik)) {
            this.poruke.add(poruka);
        }

    }
}
