package app.model;

public class Auto {
    private String name;
    private String model;
    private String tip;
    private int brojVozila;
    private double cenaDan;

    public Auto(String name, String model, String tip, int brojVozila, double cenaDan) {
        this.name = name;
        this.model = model;
        this.tip = tip;
        this.brojVozila = brojVozila;
        this.cenaDan = cenaDan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getBrojVozila() {
        return brojVozila;
    }

    public void setBrojVozila(int brojVozila) {
        this.brojVozila = brojVozila;
    }

    public double getCenaDan() {
        return cenaDan;
    }

    public void setCenaDan(double cenaDan) {
        this.cenaDan = cenaDan;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", tip='" + tip + '\'' +
                ", brojVozila=" + brojVozila +
                ", cenaDan=" + cenaDan +
                '}';
    }
}
