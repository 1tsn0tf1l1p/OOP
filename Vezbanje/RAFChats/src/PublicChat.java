import java.util.ArrayList;
import java.util.List;

public class PublicChat implements Chat{

    private List<String> poruke;

    public PublicChat() {
        this.poruke = new ArrayList<>();
    }

    public List<String> getPoruke() {
        return poruke;
    }

    public void setPoruke(List<String> poruke) {
        this.poruke = poruke;
    }

    @Override
    public boolean mozeNapisatiPoruku(Korisnik korisnik) {
        return true;
    }

    /*
    - (2p) prilikom dodavanja poruke u PublicChat potrebno je novi element liste formirati na sledeći
    način:
    [prikazano ime korisnika] ==> [poruka]
     */

    @Override
    public void dodajPoruku(Korisnik korisnik, String poruka) {

        StringBuilder sb = new StringBuilder();

        sb.append(korisnik.getPrikaznoIme());
        sb.append(" ==> ");
        sb.append(poruka);

        this.poruke.add(sb.toString());

    }

}
