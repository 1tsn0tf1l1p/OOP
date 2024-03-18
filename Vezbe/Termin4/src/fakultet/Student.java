package fakultet;

import java.util.Random;

public class Student {

    private String ime;
    private String prezime;
    private TipStudenta tipStudenta;
    private String index;
    private int brojPoenaNaIspitu;
    private boolean prepisivao; // po defaultu je false

    public Student(String ime, String prezime, TipStudenta tipStudenta, String index) {
        this.ime = ime;
        this.prezime = prezime;
        this.tipStudenta = tipStudenta;
        this.index = index;
    }

    public void radiIspit() {
        Random random = new Random();
        if(this.tipStudenta == TipStudenta.PREPISIVAC){
            // prepisuje
            // spretan/nespretan
            this.prepisivao = true;
            boolean spretan = random.nextBoolean();
            if(spretan) {
                // uspeo da prepise
                this.brojPoenaNaIspitu = 100;
            }else{
                this.brojPoenaNaIspitu = 0;
            }
        }else {
            this.prepisivao = false;
            this.brojPoenaNaIspitu = random.nextInt(101);
        }
    }

    public int getBrojPoenaNaIspitu() {
        return brojPoenaNaIspitu;
    }

    public boolean isPrepisivao() {
        return prepisivao;
    }

    public void info() {
        System.out.println(this.ime + " " + this.prezime + " " + this.index + " " + this.brojPoenaNaIspitu + " " + this.prepisivao);
    }

}
