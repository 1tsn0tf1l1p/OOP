public class Vreme extends Object{

    private int sat;
    private int minut;

    public Vreme(int sat, int minut) {
        this.sat = sat;
        this.minut = minut;
    }

    public int getSat() {
        return sat;
    }

    public int getMinut() {
        return minut;
    }

    @Override
    public String toString() {
        return "Pedja prenk je rodjen u "+this.sat+" i u "+this.minut+" minuta.";
    }
}
