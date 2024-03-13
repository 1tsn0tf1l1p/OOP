package snesko;

public class Snesko {

    private String naziv;
    private int snaga;
    private int brojZivota;

    public Snesko(String naziv, int snaga, int brojZivota) {
        this.naziv = naziv;
        this.snaga = snaga;
        this.brojZivota = brojZivota;
    }

    // navedene metode:

    public boolean pobedjen() {
        return brojZivota == 0;
    }

    private void ukloniZivote(int x) {
        brojZivota = Math.max(0, brojZivota-x);
    }

    // nsesko1.pogodi(snesko2)
    public void pogodi(Snesko pogodjenSnesko) {

        // snesko 2 = pogodjen snesko
        // snesko1 je this

        // pogodjenSnesko.brojZivota -= this.snaga;

        pogodjenSnesko.ukloniZivote(this.snaga);

    }

    public String getNaziv() {
        return naziv;
    }

    public void info(){
        System.out.println(this.naziv + "snaga " + this.snaga +" " +this.brojZivota);
    }
}
