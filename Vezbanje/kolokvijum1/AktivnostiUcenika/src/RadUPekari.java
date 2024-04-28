public class RadUPekari extends Aktivnost{


    public RadUPekari(String naziv, Smer smer, double maksimum, double minimum) {
        super(naziv, smer, maksimum, minimum);
    }

    @Override
    public int izracunajOcenu(double poeni) {
        return 0;
    }
}
