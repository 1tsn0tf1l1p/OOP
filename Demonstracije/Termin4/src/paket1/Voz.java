package paket1;

import java.util.Objects;

public class Voz {

    private String marka;
    private String vozac;

    public Voz(String marka, String vozac) {
        this.marka = marka;
        this.vozac = vozac;
    }

    public void kreni() {
        System.out.println("Obican voz krenuo");
    }

    public void stani() {
        System.out.println("Obican voz stao");
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getVozac() {
        return vozac;
    }

    public void setVozac(String vozac) {
        this.vozac = vozac;
    }

    @Override
    public String toString() {
        return marka+" "+vozac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voz voz = (Voz) o;
        return Objects.equals(marka, voz.marka) && Objects.equals(vozac, voz.vozac);
    }
}
