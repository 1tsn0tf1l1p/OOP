public class TekstualnaPoruka extends Poruka{

    private String tekst;

    public TekstualnaPoruka(String posiljalac, String tekst) {
        super(posiljalac);
        this.tekst = tekst;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    // - (0.5p) u klasi TekstualnaPoruka opisana metoda vraća tekst

    @Override
    protected String formirajSadrzinu() {
        return this.tekst;
    }
}
