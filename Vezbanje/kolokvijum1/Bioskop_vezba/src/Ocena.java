public class Ocena {

    private double ocena;
    private Grupa grupa;

    public Ocena(double ocena, Grupa grupa) {
        this.ocena = ocena;
        this.grupa = grupa;
    }

    public double getOcena() {
        return ocena;
    }

    public Grupa getGrupa() {
        return grupa;
    }

    @Override
    public String toString() {
        return "Ocena{" +
                "ocena=" + ocena +
                ", grupa=" + grupa +
                '}';
    }
}
