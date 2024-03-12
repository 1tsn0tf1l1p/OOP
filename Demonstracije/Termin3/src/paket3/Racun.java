package paket3;

import java.util.ArrayList;

public class Racun {

    private String brRacuna;
    private double stnanje;
    private ArrayList<Transakcija> listaTransakcija;

    public Racun(String brRacuna, double stnanje) {
        this.brRacuna = brRacuna;
        this.stnanje = stnanje;
        this.listaTransakcija = new ArrayList<>();
    }

    public String getBrRacuna() {
        return brRacuna;
    }

    public void setBrRacuna(String brRacuna) {
        this.brRacuna = brRacuna;
    }

    public double getStnanje() {
        return stnanje;
    }

    public void setStnanje(double stnanje) {
        this.stnanje = stnanje;
    }

    public ArrayList<Transakcija> getListaTransakcija() {
        return listaTransakcija;
    }

    public void setListaTransakcija(ArrayList<Transakcija> listaTransakcija) {
        this.listaTransakcija = listaTransakcija;
    }

    public boolean isplata(double iznos) {

        if(iznos>this.stnanje) {
            return false;
        }

        this.stnanje = this.stnanje - iznos;
        Transakcija t = new Transakcija(iznos, "7:44", TipTransakcija.ISPLATA);
        this.listaTransakcija.add(t);
        return true;

    }
}
