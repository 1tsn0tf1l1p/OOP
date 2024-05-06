import java.util.ArrayList;
import java.util.List;

public class Projekcija {

    private String naziv;
    private int trajanje;
    private int brojSlobodnihMesta;
    private List<Ocena> ocene;
    private Vreme vreme;

    public Projekcija(String naziv, int trajanje, int brojSlobodnihMesta, Vreme vreme) {
        this.naziv = naziv;
        this.trajanje = trajanje;
        this.brojSlobodnihMesta = brojSlobodnihMesta;
        this.vreme = vreme;
        this.ocene = new ArrayList<>();
    }

    public double prosecnaOcena() {

        int brojac = 0;
        double suma = 0;

        for(Ocena ocena:ocene) {
            suma+=ocena.getOcena();
            brojac++;
        }

        return suma/brojac;
    }

    public void dodajOcenu(Ocena ocena) {

        this.ocene.add(ocena);

    }

    public Ocena najboljaOcena() {

        Ocena maksimalnaOcena = new Ocena(0, 106);

        for(Ocena ocena:ocene) {

        }

    }


}
