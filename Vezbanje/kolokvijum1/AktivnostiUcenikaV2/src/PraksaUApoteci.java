public class PraksaUApoteci extends Aktivnost{

    public PraksaUApoteci(String naziv, Smer smer, double minimum, double maksimum) {
        super(naziv, Smer.APOTEKAR, 0, 100);
    }

    @Override
    public int izracunajOcenu(double brojPoena) {

        if(brojPoena <= 52) {
            return 1;
        }
        else if(brojPoena > 52 && brojPoena <= 64) {
            return 2;
        }
        else if(brojPoena > 64 && brojPoena <= 76) {
            return 3;
        }
        else if(brojPoena > 76 && brojPoena <= 88) {
            return 4;
        }

        return 5;

    }
}
