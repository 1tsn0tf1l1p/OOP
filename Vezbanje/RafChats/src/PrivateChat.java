import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrivateChat implements Chat{

    private List<String> poruke;
    private Korisnik k1;
    private Korisnik k2;
    private Korisnik prethodniPosiljalac;

    public PrivateChat(Korisnik k1, Korisnik k2) {
        this.k1 = k1;
        this.k2 = k2;
        this.poruke = new ArrayList<>();
    }

    public List<String> getPoruke() {
        return poruke;
    }

    public void setPoruke(List<String> poruke) {
        this.poruke = poruke;
    }

    public Korisnik getK1() {
        return k1;
    }

    public void setK1(Korisnik k1) {
        this.k1 = k1;
    }

    public Korisnik getK2() {
        return k2;
    }

    public void setK2(Korisnik k2) {
        this.k2 = k2;
    }

    public Korisnik getPrethodniPosiljalac() {
        return prethodniPosiljalac;
    }

    public void setPrethodniPosiljalac(Korisnik prethodniPosiljalac) {
        this.prethodniPosiljalac = prethodniPosiljalac;
    }

    @Override
    public boolean mozeNapisatiPoruku(Korisnik korisnik) {

        if(prethodniPosiljalac == null) {
            if(korisnik.equals(k1)) {
                prethodniPosiljalac = k1;
                return true;
            }
        }else {
            if(korisnik.equals(prethodniPosiljalac)) {
                return false;
            }
            else {
                prethodniPosiljalac = korisnik;
                return true;
            }
        }

        return false;
    }

    @Override
    public void dodajPoruku(Korisnik korisnik, String s) {

        poruke.add(s);
        prethodniPosiljalac = korisnik;

    }
}
