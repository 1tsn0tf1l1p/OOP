public class Odgovor implements Ocenljivo{

    private String odgovor;
    private Pitanje pitanje;

    public Odgovor(String odgovor, Pitanje pitanje) {
        this.odgovor = odgovor;
        this.pitanje = pitanje;
    }

    public String getOdgovor() {
        return odgovor;
    }

    public void setOdgovor(String odgovor) {
        this.odgovor = odgovor;
    }

    public Pitanje getPitanje() {
        return pitanje;
    }

    public void setPitanje(Pitanje pitanje) {
        this.pitanje = pitanje;
    }


    @Override
    public int oceni() {
        return pitanje.brojPoena(odgovor);
    }
}
