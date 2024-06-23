package app.model;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.io.*;
import java.util.*;

public class Baza {
    private static Baza instance;
    private List<Drzava> drzave;
    private List<Vanzemaljac> vanzemaljci;
    private Set<String> kontinenti;
    private Set<String> drzaveString;

    private Baza() {
        drzave = new ArrayList<>();
        vanzemaljci = new ArrayList<>();
        kontinenti = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        drzaveString = new HashSet<>();
        ucitaj();
        sortirajMajmune();
        dodajKontinente();
        dodajDrzaveString();
        sortirajKontinente();
    }

    private void sortirajKontinente() {

    }

    public void setKontinenti(Set<String> kontinenti) {
        this.kontinenti = kontinenti;
    }

    public Set<String> getDrzaveString() {
        return drzaveString;
    }

    public void setDrzaveString(Set<String> drzaveString) {
        this.drzaveString = drzaveString;
    }

    private void dodajDrzaveString() {
        for (Drzava drzava : drzave) {
            drzaveString.add(drzava.getDrzavaIme());
        }
    }

    private void dodajKontinente() {
        for (Drzava drzava : drzave) {
            kontinenti.add(drzava.getKontinentIme());
        }
        kontinenti.add("Antarktik");
        kontinenti.add("Svi kontinenti");
        System.out.println(kontinenti);
    }

    private void sortirajMajmune() {
        vanzemaljci.sort(null);
    }

    private String nadjiKontinent(String drzava) {
        for (Drzava drzava1 : drzave) {
            System.out.println(drzava + " " + drzava1);
            if(drzava1.getDrzavaIme().equals(drzava)) {
                //System.out.println("USAO U IF");
                return drzava1.getKontinentIme();
            }
        }
        return "";
    }


    private void ucitaj() {
        File file = new File("/home/filip/Documents/RAF/1godina/OOP/Ispit/Vanzemaljci/src/main/resources/vanzemaljci.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int flag = 0;

            String line = null;
            String kontinent = null;
            if(flag == 0) {
                while((line = bufferedReader.readLine()) != null) {
                    if(flag == 0) {
                        if(line.contains("Kontinent")) {
                            String[] splitKontinent = line.split(":");
                            kontinent = splitKontinent[1].trim();
                        }
                        else if(!line.contains("IZGUBLJENI")){
                            Drzava d = new Drzava(line, kontinent);
                            drzave.add(d);
                        }
                        else {
                            flag = 1;
                        }
                    }
                    else if(flag == 1) {
                        if(!line.contains("PRONADJENI")) {
                            String[] splitovanIzgubljen = line.split(";");
                            Vanzemaljac v = new Vanzemaljac(Integer.parseInt(splitovanIzgubljen[0]), false, "", splitovanIzgubljen[1]);
                            vanzemaljci.add(v);
                        }else {
                            flag = 2;
                        }
                    }
                    else if(flag == 2) {
                        String[] splitovanPronadjen = line.split(";");
                        Vanzemaljac v = new Vanzemaljac(Integer.parseInt(splitovanPronadjen[0]), true, splitovanPronadjen[1], nadjiKontinent(splitovanPronadjen[1]));
                        vanzemaljci.add(v);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //System.out.println(drzave);
        //System.out.println(vanzemaljci);
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

    public List<Drzava> getDrzave() {
        return drzave;
    }

    public void setDrzave(List<Drzava> drzave) {
        this.drzave = drzave;
    }

    public List<Vanzemaljac> getVanzemaljci() {
        return vanzemaljci;
    }

    public void setVanzemaljci(List<Vanzemaljac> vanzemaljci) {
        this.vanzemaljci = vanzemaljci;
    }

    public Set<String> getKontinenti() {
        return kontinenti;
    }
}
