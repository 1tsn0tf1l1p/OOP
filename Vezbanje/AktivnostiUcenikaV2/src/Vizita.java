public class Vizita extends Aktivnost{

    public Vizita(String naziv, Smer smer, double minimum, double maksimum) {
        super(naziv, Smer.LEKAR, 1, 5);
    }

    @Override
    public int izracunajOcenu(double brojPoena) {
        return (int)(brojPoena*0.75 + 1.25);
    }
}
