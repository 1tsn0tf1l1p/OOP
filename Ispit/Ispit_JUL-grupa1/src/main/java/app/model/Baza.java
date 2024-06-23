package app.model;

import java.io.*;
import java.util.*;

public class Baza {
    private static Baza instance;
    List<Auto> automobili;
    Map<Tip, List<Auto>> tipoviAuti;
    List<Tip> tipovi;
    List<Rezervisan> rezervisani;
    Set<String> sviTipovi;

    private Baza() {
        automobili = new ArrayList<>();
        tipovi = new ArrayList<>();
        tipoviAuti = new HashMap<>();
        rezervisani = new ArrayList<>();
        sviTipovi = new HashSet<>();
        ucitaj();
    }

    private void ucitaj() {
        File file = new File("/home/filip/Documents/RAF/1godina/OOP/Ispit/Ispit_JUL-grupa1/src/main/resources/vozila.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            line = bufferedReader.readLine();

            while((line = bufferedReader.readLine()) != null) {
                String[] splitovano = line.split("\\s+");
                int br = Integer.parseInt(splitovano[3]);
                double cena = Double.parseDouble(splitovano[4]);
                Auto a = new Auto(splitovano[0], splitovano[1], splitovano[2], br, cena);
                automobili.add(a);
            }

            for (Auto auto : automobili) {
                sviTipovi.add(auto.getTip());
            }

            for (String s : sviTipovi) {
                double min = Double.MAX_VALUE;
                double max = 0;
                for (Auto auto : automobili) {
                    if(s.equals(auto.getTip())) {
                        if(auto.getCenaDan() < min) {
                            min = auto.getCenaDan();
                        }
                        if(auto.getCenaDan() > max) {
                            max = auto.getCenaDan();
                        }
                    }
                }
                Tip t = new Tip(s, max, min);
                tipovi.add(t);
            }

            for (Tip tip : tipovi) {
                List<Auto> autic = new ArrayList<>();
                for (Auto auto : automobili) {
                    if(auto.getTip().equals(tip.getIme())) {
                        autic.add(auto);
                    }
                }
                tipoviAuti.put(tip, autic);
            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Baza getInstance() {
        if(instance == null) {
            instance = new Baza();
        }
        return instance;
    }

    public List<Auto> getAutomobili() {
        return automobili;
    }

    public Map<Tip, List<Auto>> getTipoviAuti() {
        return tipoviAuti;
    }

    public List<Tip> getTipovi() {
        return tipovi;
    }

    public List<Rezervisan> getRezervisani() {
        return rezervisani;
    }

    public Set<String> getSviTipovi() {
        return sviTipovi;
    }
}
