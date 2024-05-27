import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String brojevi[] = in.nextLine().split(" ");
        List<Integer> brojeviLista = null;
        try {
            if(Integer.parseInt(brojevi[0])%10==0) {
                brojeviLista = new ArrayList<Integer>();
                brojeviLista.add(10);
            }
            if(brojeviLista.size()>=1) {
                System.out.println("ima bar jedan");
                Integer br1 = Integer.parseInt(brojevi[1]);
                brojeviLista.add(br1);
            }
            System.out.println("kraj try blocka");
        }
        catch (NullPointerException e) {
            System.out.println("Null pointer");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Pogresan Indeks");
        }
        finally {
            System.out.println("Blok finally");
        }
        System.out.println("Lista = "+brojeviLista);
    }
}
