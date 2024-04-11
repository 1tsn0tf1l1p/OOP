import java.util.List;

public class GroupChat implements Chat{

    private List<Korisnik> grupa;
    private List<Korisnik> posiljaoci;
    private List<String> poruke;

    public GroupChat() {
    }

    public void dodajUGrupu(Korisnik korisnik) {

        if(this.grupa.contains(korisnik)) {
            return;
        }
        this.grupa.add(korisnik);

    }

    public void ukloniIzGrupe(Korisnik korisnik) {

        this.grupa.remove(korisnik);

    }

    public List<Korisnik> getGrupa() {
        return grupa;
    }

    public void setGrupa(List<Korisnik> grupa) {
        this.grupa = grupa;
    }

    public List<Korisnik> getPosiljaoci() {
        return posiljaoci;
    }

    public void setPosiljaoci(List<Korisnik> posiljaoci) {
        this.posiljaoci = posiljaoci;
    }

    public List<String> getPoruke() {
        return poruke;
    }

    public void setPoruke(List<String> poruke) {
        this.poruke = poruke;
    }

    @Override
    public boolean mozeNapisatiPoruku(Korisnik korisnik) {
        return this.grupa.contains(korisnik);
    }

    @Override
    public void dodajPoruku(Korisnik korisnik, String poruka) {
        this.posiljaoci.add(korisnik);
        this.poruke.add(poruka);
    }
}
