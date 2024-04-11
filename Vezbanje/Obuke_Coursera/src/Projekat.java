public class Projekat extends Obuka{

    private int maksimalanBrojPolaznika;

    public Projekat(String naziv, Oblast oblast, int minimalanBrojPolaznika, int maksimalanBrojPolaznika) {
        super(naziv, oblast, minimalanBrojPolaznika);
        this.maksimalanBrojPolaznika = maksimalanBrojPolaznika;
    }

    public int getMaksimalanBrojPolaznika() {
        return maksimalanBrojPolaznika;
    }

    public void setMaksimalanBrojPolaznika(int maksimalanBrojPolaznika) {
        this.maksimalanBrojPolaznika = maksimalanBrojPolaznika;
    }
}
