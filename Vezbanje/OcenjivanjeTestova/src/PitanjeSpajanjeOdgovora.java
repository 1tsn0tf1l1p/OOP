import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PitanjeSpajanjeOdgovora extends Pitanje{

    private List<String> kolona1;
    private List<String> kolona2;
    private IndeksiTacnoPovezanih tacniOdgovori;

    public PitanjeSpajanjeOdgovora(String tekstPitanja, int brojPoena, IndeksiTacnoPovezanih tacniOdgovori) {
        super(tekstPitanja, brojPoena);
        this.kolona1 = new ArrayList<>();
        this.kolona2 = new ArrayList<>();
        this.tacniOdgovori = tacniOdgovori;
    }

    public List<String> getKolona1() {
        return kolona1;
    }

    public void setKolona1(List<String> kolona1) {
        this.kolona1 = kolona1;
    }

    public List<String> getKolona2() {
        return kolona2;
    }

    public void setKolona2(List<String> kolona2) {
        this.kolona2 = kolona2;
    }

    public IndeksiTacnoPovezanih getTacniOdgovori() {
        return tacniOdgovori;
    }

    public void setTacniOdgovori(IndeksiTacnoPovezanih tacniOdgovori) {
        this.tacniOdgovori = tacniOdgovori;
    }

    @Override
    public int brojPoena(String odgovori) {

        String[] nizOdgovora = odgovori.split(",");

        Scanner sc = new Scanner(System.in);

        System.out.println("Molimo unesite tacne odgovore prve kolone: ");
        this.tacniOdgovori.setIndeksPrveKolone(sc.nextInt());

        System.out.println("Molimo unesite tacne odgovore drug kolone (unos se prekida kad unesete 0): ");
        while(sc.nextInt()!=0) {
            this.tacniOdgovori.setIndeksiDrugeKolone(sc.nextInt());
        }

        for(String s:nizOdgovora) {
            if(s.endsWith("1")) {
                this.kolona1.add(s);
            }
            else if(s.endsWith("2")) {
                this.kolona2.add(s);
            }
        }



        return 0;
    }
}
