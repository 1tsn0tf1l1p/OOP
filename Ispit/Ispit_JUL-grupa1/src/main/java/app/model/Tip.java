package app.model;

public class Tip {
    private String ime;
    private double max;
    private double min;

    public Tip(String ime, double max, double min) {
        this.ime = ime;
        this.max = max;
        this.min = min;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    @Override
    public String toString() {
        if(this.max == this.min) {
            return this.ime + " cena po danu: $" + this.min;
        }
        else {
            return this.ime + " cena po danu: $" + this.min + "-$"+this.max;
        }
    }
}
