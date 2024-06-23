package app.model;

import java.io.*;
import java.util.*;

public class Baza {
    private static Baza instance;
    private List<Pitanje> pitanjaTermin1;
    private List<Pitanje> pitanjaTermin2;
    private List<Student> studenti;

    private Baza(){
        pitanjaTermin1 = new ArrayList<>();
        pitanjaTermin2 = new ArrayList<>();
        studenti = new ArrayList<>();
        ucitaj();

    }

    public void sortirajBazu() {
        studenti.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getUkupno() < o2.getUkupno()) {
                    return 1;
                }
                else if(o1.getUkupno() > o2.getUkupno()) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
    }

    private void ucitaj() {
        File file = new File("/home/filip/Documents/RAF/1godina/OOP/Ispit/Ispit_JUN-grupa2v2/src/main/resources/OOP-Test-prvi termin.txt");
        String line = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            line = bufferedReader.readLine();
            String[] splitovanaPrvaLinija = line.split(",");
            for(int i = 3; i<splitovanaPrvaLinija.length; i++) {
                String[] splitovanoPitanje = splitovanaPrvaLinija[i].split("/");
                Pitanje p = new Pitanje(splitovanoPitanje[0].trim(), "termin 1", Double.parseDouble(splitovanoPitanje[1]));
                pitanjaTermin1.add(p);
            }
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitovanStudent = line.split(",");
                Map<Pitanje, Double> poeni = new HashMap<>();
                int i = 3;
                for (Pitanje pitanje : pitanjaTermin1) {
                    if(splitovanStudent[i].equals("-")) {
                        poeni.put(pitanje, 0.0);
                    }
                    else {
                        poeni.put(pitanje, Double.parseDouble(splitovanStudent[i]));
                    }
                    i++;
                }
                Student s = new Student(splitovanStudent[0], splitovanStudent[1], splitovanStudent[2], "termin 1", poeni);
                studenti.add(s);
            }
            //System.out.println(studenti.get(4));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File file2 = new File("/home/filip/Documents/RAF/1godina/OOP/Ispit/Ispit_JUN-grupa2v2/src/main/resources/OOP-Test-drugi termin.txt");
        String line2 = null;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file2))) {
            line2 = bufferedReader.readLine();
            String[] splitovanaPrvaLinija = line2.split(",");
            for(int i = 3; i<splitovanaPrvaLinija.length; i++) {
                String[] splitovanoPitanje = splitovanaPrvaLinija[i].split("/");
                Pitanje p = new Pitanje(splitovanoPitanje[0].trim(), "termin 2", Double.parseDouble(splitovanoPitanje[1]));
                pitanjaTermin2.add(p);
            }
            while ((line2 = bufferedReader.readLine()) != null) {
                String[] splitovanStudent = line2.split(",");
                Map<Pitanje, Double> poeni = new HashMap<>();
                int i = 3;
                for (Pitanje pitanje : pitanjaTermin2) {
                    if(splitovanStudent[i].equals("-")) {
                        poeni.put(pitanje, 0.0);
                    }
                    else {
                        poeni.put(pitanje, Double.parseDouble(splitovanStudent[i]));
                    }
                    i++;
                }
                Student s = new Student(splitovanStudent[0], splitovanStudent[1], splitovanStudent[2], "termin 2", poeni);
                studenti.add(s);
            }
            //System.out.println(studenti.get(250));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        /*
        System.out.println("PITANJA 1");
        System.out.println(pitanjaTermin1);
        System.out.println("PITANJA 2");
        System.out.println(pitanjaTermin2);

         */
    }

    public static Baza getInstance() {
        if(instance == null) {
            instance = new Baza();
        }
        return instance;
    }

    public static void setInstance(Baza instance) {
        Baza.instance = instance;
    }

    public List<Pitanje> getPitanjaTermin1() {
        return pitanjaTermin1;
    }

    public void setPitanjaTermin1(List<Pitanje> pitanjaTermin1) {
        this.pitanjaTermin1 = pitanjaTermin1;
    }

    public List<Pitanje> getPitanjaTermin2() {
        return pitanjaTermin2;
    }

    public void setPitanjaTermin2(List<Pitanje> pitanjaTermin2) {
        this.pitanjaTermin2 = pitanjaTermin2;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }
}
