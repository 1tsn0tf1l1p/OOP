package paket2;

import java.util.ArrayList;

public class Automobil {

    private String marka;
    private int km;
    private int godiste;
    private ArrayList<String> istorijaVlasnika = new ArrayList<>();

    public Automobil(String marka, int km, int godiste) {
        this.marka = marka;
        this.km = km;
        this.godiste = godiste;

    }

    public String getMarka() {
        return marka;
    }

    public int getKm() {
        return km;
    }

    public int getGodiste() {
        return godiste;
    }

    public ArrayList<String> getIstorijaVlasnika() {
        return istorijaVlasnika;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setKm(int km) {
        if(km<this.km){
            return;
        }
        this.km = km;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public void setIstorijaVlasnika(ArrayList<String> istorijaVlasnika) {
        this.istorijaVlasnika = istorijaVlasnika;
    }
}
