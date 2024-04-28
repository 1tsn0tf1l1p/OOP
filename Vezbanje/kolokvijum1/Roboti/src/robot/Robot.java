package robot;

public class Robot {

    private String ime;
    private Boja boja;
    private int tezina;

    public Robot(String ime, Boja boja, int tezina) {
        this.ime = ime;
        this.boja = boja;
        this.tezina = tezina;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        if(ime.length() < 5){
            this.ime = ime;
        }
    }

    public Boja getBoja() {
        return boja;
    }

    public void setBoja(Boja novaBoja) {
        this.boja = novaBoja;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }

    public void aboutMe() {
        System.out.println("Moje ime je "+this.ime+", imam "+this.tezina+" kilograma i ja sam od "+this.boja+" boje, ovo je hex code - "+this.boja.getHexCode());
    }
}
