import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Coursera coursera = Coursera.getInstance();

        Profesor p1 = new Profesor("Marko", "Mladenovic", "235395e", Oblast.PROGRAMIRANJE);
        Profesor p2 = new Profesor("Bojana", "Suki Surla", "dkgjl32", Oblast.SLIKARSTVO);

        Obuka onlajnKurs = new Kurs("UUP", Oblast.STATISTIKA, 3, true);
        Obuka pera = new Projekat("UUP", Oblast.STATISTIKA, 3, 46);

        Polaznik polaznik1 = new Polaznik("Pavle", "Pantic", "pajadojaja@gmail.com");
        Polaznik polaznik2 = new Polaznik("Filip", "Cobanin", "cofaka@gmail.com");
        Polaznik polaznik3 = new Polaznik("Jovan", "Tosic", "jovantosic04@gmail.com");
        Polaznik polaznik4 = new Polaznik("Milan", "Segan", "milansegancarina55gmail.com");
        Polaznik polaznik5 = new Polaznik("Nikola", "Nesic", "neskefortnite@gmail.com");

        polaznik1.registruj(onlajnKurs);
        polaznik2.registruj(onlajnKurs);
        polaznik3.registruj(onlajnKurs);
        polaznik4.registruj(onlajnKurs);
        polaznik5.registruj(onlajnKurs);
        polaznik3.registruj(pera);


        List<Obuka> obuke = new ArrayList<>();

        obuke.add(onlajnKurs);
        obuke.add(pera);

        try {
            PrintWriter printWriter = new PrintWriter("test.txt");

            for(Obuka o:obuke){
                printWriter.write(o.toString());
            }

            printWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("Neuspesan unoj u fajl");
        }



    }
}
