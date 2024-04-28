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

    @Override
    public void dodajPoruku(Korisnik korisnik, String s) {

        StringBuilder sb = new StringBuilder();

        sb.append("[").append(korisnik.getPrikaznoIme()).append("] ==> ").append(s);

        poruke.add(sb.toString());

    }
}
