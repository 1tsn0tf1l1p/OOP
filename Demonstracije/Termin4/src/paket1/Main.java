package paket1;

public class Main {
    public static void main(String[] args) {

        Voz v1 = new Voz("Stedler", "Zika");

        v1.kreni();

        TeretniVoz v2 = new TeretniVoz("ABC", "Pera", 2000);

        v2.utovari();

        Voz vt2 = new TeretniVoz("AVC", "Perki", 2000);

        vt2.kreni();

        TeretniVoz v3 = new TeretniVoz("ABC", "Pera", 2000);
        TeretniVoz v4 = new TeretniVoz("ABC", "Pera", 2000);

        System.out.println(v3.equals(v4));

        System.out.println(v2.toString());

    }

}
