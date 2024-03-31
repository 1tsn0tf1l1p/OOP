public class ProzniPisac extends Pisac{

    public ProzniPisac(String ime, String prezime, int godinaRodjenja) {
        super(ime, prezime, godinaRodjenja);
    }

    @Override
    public Knjizevnost objavljuje(String naziv, int godina, TipKnjizevnosti tipKnjizevnosti) {

        return new AutorskaKnjizevnost(naziv, TipKnjizevnosti.EPIKA);

    }
}
