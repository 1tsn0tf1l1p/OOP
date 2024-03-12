package paket3;

public class Transakcija {

    private double iznos;
    private String vreme;
    private TipTransakcija tipTransakcije;

    public Transakcija(double iznos, String vreme, TipTransakcija tipTransakcije) {
        this.iznos = iznos;
        this.vreme = vreme;
        this.tipTransakcije = tipTransakcije;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public String getVreme() {
        return vreme;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public TipTransakcija getTipTransakcije() {
        return tipTransakcije;
    }

    public void setTipTransakcije(TipTransakcija tipTransakcije) {
        this.tipTransakcije = tipTransakcije;
    }
}
