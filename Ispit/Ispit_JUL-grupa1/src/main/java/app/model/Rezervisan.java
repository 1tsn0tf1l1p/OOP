package app.model;

import java.time.LocalDate;

public class Rezervisan {
    private String tip;
    private String marka;
    private String model;
    private double cena;
    private LocalDate odDatum;
    private LocalDate doDatum;
    private double ukupnaCena;

    public Rezervisan(String tip, String marka, String model, double cena, LocalDate odDatum, LocalDate doDatum, double ukupnaCena) {
        this.tip = tip;
        this.marka = marka;
        this.model = model;
        this.cena = cena;
        this.odDatum = odDatum;
        this.doDatum = doDatum;
        this.ukupnaCena = ukupnaCena;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public LocalDate getOdDatum() {
        return odDatum;
    }

    public void setOdDatum(LocalDate odDatum) {
        this.odDatum = odDatum;
    }

    public LocalDate getDoDatum() {
        return doDatum;
    }

    public void setDoDatum(LocalDate doDatum) {
        this.doDatum = doDatum;
    }

    public double getUkupnaCena() {
        return ukupnaCena;
    }

    public void setUkupnaCena(double ukupnaCena) {
        this.ukupnaCena = ukupnaCena;
    }

    @Override
    public String toString() {
        return "Rezervisan{" +
                "tip='" + tip + '\'' +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", cena=" + cena +
                ", odDatum=" + odDatum +
                ", doDatum=" + doDatum +
                ", ukupnaCena=" + ukupnaCena +
                '}';
    }
}
