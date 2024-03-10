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

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getSnaga() {
        return snaga;
    }

    public void setSnaga(int snaga) {
        this.snaga = snaga;
    }

    public int getBrojZivota() {
        return brojZivota;
    }

    public void setBrojZivota(int brojZivota) {
        this.brojZivota = brojZivota;
    }

    public boolean siZiv() {
        if(brojZivota == 0){
            return false;
        }else{
            return true;
        }
    }

    public void ukloniZivote(int x) {
        this.brojZivota = Math.max(0, this.brojZivota - x);
    }

    public void gadjaj(Snesko s1) {
        s1.ukloniZivote(this.snaga);
    }

}
