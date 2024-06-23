package app.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baza {
    private List<Kurs> kursevi;
    private static Baza instance;
    private static int raspolozivo = 1000;

    private Baza() {
        kursevi = new ArrayList<>();
        ucitaj();
    }

    public static Baza getInstance() {
        if(instance == null) {
            instance = new Baza();
        }
        return instance;
    }

    public void ucitaj() {
        File file = new File("/home/filip/Documents/RAF/1godina/OOP/Ispit/Ispit_JUN-grupa1/src/main/resources/RAF_Coursera.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitovano = line.split("[,>:]");
                String[] trajanje = splitovano[2].split(" ");
                Integer trajanjeInt = Integer.parseInt(trajanje[0]);
                kursevi.add(new Kurs(splitovano[0], splitovano[1], trajanjeInt, splitovano[3]));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Kurs> getKursevi() {
        return kursevi;
    }

    public static int getRaspolozivo() {
        return raspolozivo;
    }

    public static void setRaspolozivo(int raspolozivo) {
        Baza.raspolozivo = raspolozivo;
    }
}
