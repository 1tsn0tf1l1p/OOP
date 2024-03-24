package Student;

public class Student {

    private String ime;
    private String prezime;
    private TipStudenta tipStudenta;
    private String index;
    private int brojPoenaNaIspitu;
    private boolean prepisivao;

    public Student(String ime, String prezime, TipStudenta tipStudenta, String index) {
        this.ime = ime;
        this.prezime = prezime;
        this.tipStudenta = tipStudenta;
        this.index = index;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public TipStudenta getTipStudenta() {
        return tipStudenta;
    }

    public void setTipStudenta(TipStudenta tipStudenta) {
        this.tipStudenta = tipStudenta;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public int getBrojPoenaNaIspitu() {
        return brojPoenaNaIspitu;
    }

    public void setBrojPoenaNaIspitu(int brojPoenaNaIspitu) {
        this.brojPoenaNaIspitu = brojPoenaNaIspitu;
    }

    public boolean isPrepisivao() {
        return prepisivao;
    }

    public void setPrepisivao(boolean prepisivao) {
        this.prepisivao = prepisivao;
    }

    public void radiIspit(int x) {
        this.brojPoenaNaIspitu = x;
        if(this.tipStudenta)

    }


}
