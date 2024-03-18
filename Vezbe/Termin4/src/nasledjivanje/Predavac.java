package nasledjivanje;

import java.util.ArrayList;

public class Predavac extends Zaposljeni{

    private String papirologija;

    private ArrayList<String> predmeti;
    public Predavac(String ime, String prezime, int godinaRada, String papirologija) {
        super(ime, prezime, godinaRada); // poziv konstruktora nadklase (Zaposljeni)
        this.papirologija = papirologija;
        this.predmeti = new ArrayList<>();
    }


}
