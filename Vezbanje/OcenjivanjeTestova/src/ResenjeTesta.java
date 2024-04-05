import java.util.ArrayList;
import java.util.List;

public class ResenjeTesta implements Ocenljivo{

    private String nazivTesta;
    private String kandidat;
    private List<Odgovor> odgovori;
    private int ocena;

    public ResenjeTesta(String nazivTesta, String kandidat) {
        this.nazivTesta = nazivTesta;
        this.kandidat = kandidat;
        this.odgovori = new ArrayList<>();
    }

    public void odgovori(Pitanje pitanje, String s) {
        // TODO
    }

    public String getNazivTesta() {
        return nazivTesta;
    }

    public void setNazivTesta(String nazivTesta) {
        this.nazivTesta = nazivTesta;
    }

    public String getKandidat() {
        return kandidat;
    }

    public void setKandidat(String kandidat) {
        this.kandidat = kandidat;
    }

    public List<Odgovor> getOdgovori() {
        return odgovori;
    }

    public void setOdgovori(List<Odgovor> odgovori) {
        this.odgovori = odgovori;
    }

    @Override
    public int oceni() {
        int ukupanBrojPoena = 0;
        for(Odgovor o:odgovori) {
            ukupanBrojPoena += o.getPitanje().getBrojPoena();
        }

        return ukupanBrojPoena;
    }
}
