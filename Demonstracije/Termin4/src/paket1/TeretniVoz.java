package paket1;

public class TeretniVoz extends Voz{

    private int nosivost;

    public TeretniVoz(String marka, String vozac, int nosivost) {
        super(marka, vozac);
        this.nosivost = nosivost;
    }

    public int getNosivost() {
        return nosivost;
    }

    public void setNosivost(int nosivost) {
        this.nosivost = nosivost;
    }

    public void utovari() {
        System.out.println("Voz je utovaren");
    }

    @Override
    public void kreni() {
        System.out.println("Teretni voz krenuo");
    }

}
