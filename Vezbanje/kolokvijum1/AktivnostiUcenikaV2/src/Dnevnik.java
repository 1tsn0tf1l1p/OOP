import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.*;

public class Dnevnik implements ImaProsek {

    private List<Aktivnost> aktivnosti;
    private List<Beleska> beleske;
    private List<Klasa> klase;

    public Dnevnik() {
        this.aktivnosti = new ArrayList<>();
        this.beleske = new ArrayList<>();
        this.klase = new ArrayList<>();
    }

    public List<Aktivnost> getAktivnosti() {
        return aktivnosti;
    }

    public void setAktivnosti(List<Aktivnost> aktivnosti) {
        this.aktivnosti = aktivnosti;
    }

    public List<Beleska> getBeleske() {
        return beleske;
    }

    public void setBeleske(List<Beleska> beleske) {
        this.beleske = beleske;
    }

    public List<Klasa> getKlase() {
        return klase;
    }

    public void setKlase(List<Klasa> klase) {
        this.klase = klase;
    }

    public Klasa dodajKlasu(Smer smer, int razred, int odeljenje, String razredniStaresina) {

        Klasa novaKlasa = new Klasa(smer, razred, odeljenje, razredniStaresina);

        if(!this.klase.contains(novaKlasa)) {
            return novaKlasa;
        }

        return null;
    }

    public List<Klasa> nadjiKlaseZaSmer(Smer smer) {

        List<Klasa> sveMoguceKlaseZaSmer = new ArrayList<>();

        for (Klasa klasa : klase) {
            if(klasa.getSmer() == smer) {
                sveMoguceKlaseZaSmer.add(klasa);
            }
        }

        return sveMoguceKlaseZaSmer;

    }

    public Ucenik dodajUcenika(String ime, String prezime, String jmbg, int razred, int odeljenje, Smer smer) {

        int cnt = 0;

        for (Klasa klasa : klase) {
            if(klasa.getSmer() == smer && klasa.getRazred() == razred && klasa.getOdeljenje() == odeljenje) {
                cnt++;
                for (Ucenik u : klasa.getUcenici()) {
                    if(u.getJmbg().equals(jmbg)) {
                        return null;
                    }else {
                        if(cnt > 0) {
                            Ucenik noviUcenik = new Ucenik(ime, prezime, jmbg, klasa);
                            klasa.getUcenici().add(u);
                            return noviUcenik;
                        }
                    }
                }
            }
        }

            if(cnt == 0) {
                Klasa novaKlasa = new Klasa(smer, razred, odeljenje, " ");
                Ucenik noviUcenik = new Ucenik(ime, prezime, jmbg, novaKlasa);
                this.klase.add(novaKlasa);
                novaKlasa.getUcenici().add(noviUcenik);
                return noviUcenik;
            }

        return null;

    }

    public Aktivnost dodajAktivnost(Aktivnost aktivnost) {

        if(!this.aktivnosti.contains(aktivnost)) {
            this.aktivnosti.add(aktivnost);
            return aktivnost;
        }
        else {
            return aktivnost;
        }

    }

    public Beleska dodajBelesku(Ucenik ucenik, Aktivnost aktivnost, int trajanje, String opis, double brojPoena, LocalDate datum) {

        Beleska novaBeleska = new Beleska(ucenik, aktivnost, trajanje, opis, brojPoena, datum);

        if(!(novaBeleska.getUcenik().getKlasa().getSmer() == aktivnost.getSmer())) {
            System.out.println("Greska, smerovi nisu isti!");
            return null;
        }
        if(novaBeleska.getTrajanje() < 5) {
            System.out.println("Greska, trajanje je manje od 5 minuta.");
            return null;
        }

        return novaBeleska;

    }

    @Override
    public double prosek() {

        double zbir = 0;
        int cnt = 0;

        for (Beleska beleska : beleske) {
            zbir = zbir + beleska.getTrajanje();
            cnt++;
        }

        return (zbir/cnt);

    }

    public double obracunProsecneOceneSvihAktivnostiUcenika() {

        Set<Ucenik> sviUcenici = new HashSet<>();

        for (Beleska beleska : beleske) {
            sviUcenici.add(beleska.getUcenik());
        }

        double zbir = 0;
        int cnt = 0;
        int ocene = 0;

        try {
            PrintWriter pw = new PrintWriter("ispis.txt");

            for (Ucenik ucenik : sviUcenici) {
                Collections.sort(ucenik.getBeleske());
                for (Beleska beleska : ucenik.getBeleske()) {
                    pw.write(ucenik.getIme() + " " + ucenik.getPrezime() + "\n");
                    pw.write(beleska.toString() + "\n");
                    zbir += beleska.getAktivnost().izracunajOcenu(beleska.getBrojPoena());
                    cnt++;
                    ocene += beleska.getAktivnost().izracunajOcenu(beleska.getBrojPoena());
                }
                if(cnt == 0) {
                    pw.write("Nema zabelezenih aktivnosti\n");
                }else{
                    pw.write(zbir + " (" + ocene/cnt + "\n");
                }
                zbir = 0;
                cnt = 0;
                ocene = 0;
            }

            pw.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return (zbir/cnt);
    }

    public void ispisAktivnosti() {

        for (Aktivnost aktivnost : aktivnosti) {
            System.out.println(aktivnost.toString());
        }

    }
}
