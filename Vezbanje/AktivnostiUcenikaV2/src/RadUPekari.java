public class RadUPekari extends Aktivnost{

    public RadUPekari(String naziv, Smer smer, double minimum, double maksimum) {
        super(naziv, Smer.PEKAR, 5, 10);
    }

    @Override
    public int izracunajOcenu(double brojPoena) {

        return (int)(brojPoena*0.75 - 1.75);

    }
}
