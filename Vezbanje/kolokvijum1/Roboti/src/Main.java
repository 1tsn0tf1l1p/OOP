import robot.Boja;
import robot.Robot;

public class Main {
    public static void main(String[] args) {

        Robot r1 = new Robot("Pera 3000", Boja.CRVENA, 176);

        r1.aboutMe();
        r1.setIme("Zokiiiiiii");
        r1.setBoja(Boja.ROZE);
        r1.aboutMe();

    }
}
