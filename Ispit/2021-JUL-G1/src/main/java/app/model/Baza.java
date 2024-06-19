package app.model;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Baza {
    private List<Transakcija> transakcije;
    private Set<String> kategorije;
    private int trenutnoStanje;
    private static Baza instance;

    private Baza() {
        transakcije = new ArrayList<>();
        kategorije = new HashSet<>();
        this.trenutnoStanje = 0;
        ucitaj();
    }

    public static Baza getInstance() {
        if(instance == null) {
            instance = new Baza();
        }
        return instance;
    }

    public int getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public List<Transakcija> getTransakcije() {
        return transakcije;
    }

    public Set<String> getKategorije() {
        return kategorije;
    }

    public void ucitaj() {
        File file = new File("/home/filip/Documents/RAF/1godina/OOP/Ispit/2021-JUL-G1/src/main/resources/placanja.txt");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null) {
                String splitovano[] = line.split(";");
                LocalDate datum = LocalDate.parse(splitovano[2], DateTimeFormatter.ofPattern("dd.MM.yyyy."));
                if(splitovano.length == 3) {
                    // uplata
                    Transakcija transakcija = new Transakcija(TipTransakcije.UPLATA, Integer.valueOf(splitovano[0]),
                            splitovano[1], datum);
                    this.getTransakcije().add(transakcija);
                    this.trenutnoStanje += transakcija.getIznos();
                }else {
                    // isplata
                    Transakcija transakcija = new Transakcija(TipTransakcije.ISPLATA, Integer.valueOf(splitovano[0]),
                            splitovano[1], datum, splitovano[3]);
                    this.getTransakcije().add(transakcija);
                    this.getKategorije().add(splitovano[3]);
                    this.trenutnoStanje -= transakcija.getIznos();
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setTransakcije(List<Transakcija> transakcije) {
        this.transakcije = transakcije;
    }

    public void setKategorije(Set<String> kategorije) {
        this.kategorije = kategorije;
    }

    public void setTrenutnoStanje(int trenutnoStanje) {
        this.trenutnoStanje = trenutnoStanje;
    }

    public static void setInstance(Baza instance) {
        Baza.instance = instance;
    }
}
