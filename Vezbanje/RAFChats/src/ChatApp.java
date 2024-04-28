public class ChatApp {
    public static void main(String[] args) {

        Korisnik k1 = new Korisnik("Milan Segan", "milansegancarina55", "milancarina");
        Korisnik k2 = new Korisnik("Filip Cobanin", "fcobanin", "jebeMkurve23");
        Korisnik k3 = new Korisnik("Dalibor Hagel", "hakidaki123", "dfljklk32");
        Korisnik k4 = new Korisnik("Igor Cirkovic", "igipigi", "pancevackiIgi123");
        Korisnik k5 = new Korisnik("Maja Cvijan", "makicacvikica", "Grd00ba123");

        Aplikacija aplikacija = new Aplikacija();

        Registracija registracija = new Registracija(k1, "milancarina");
        Registracija registracija2 = new Registracija(k2, "jebeMkurve23");
        Registracija registracija3 = new Registracija(k3, "dfljklk32");
        Registracija registracija4 = new Registracija(k4, "pancevackivelja");
        Registracija registracija5 = new Registracija(k5, "Grd00ba123");

        registracija.registrujKorisnika();
        registracija2.registrujKorisnika();
        registracija3.registrujKorisnika();
        registracija4.registrujKorisnika();
        registracija5.registrujKorisnika();

        registracija.prijava("milansegancarina55", "milancarina");
        registracija2.prijava("fcobanin", "jebeMkurve23");
        registracija3.prijava("hakidaki123", "dfljklk32");
        registracija4.prijava("igipigi", "pancevackiIgi123");
        registracija5.prijava("makicacvikica", "grdooba123");

        Chat pc1 = new PublicChat();
        Chat pc2 = new PublicChat();

        Chat gc1 = new GroupChat();
        Chat gc2 = new GroupChat();

        Chat ppc1 = new PrivateChat(k1, k2);
        Chat ppc2 = new PrivateChat(k5, k3);

        Chat jmc1 = new JustMeChat(k1);
        Chat jmc2 = new JustMeChat(k2);

        pc1.dodajPoruku(k1, "De ste kurve");
        pc2.dodajPoruku(k2, "Ja jebem kittene na discordu");

        gc1.dodajPoruku(k3, "20 dinara");
        gc2.dodajPoruku(k5, "Koja grdoooba");

        ppc1.dodajPoruku(k1, "segane lizao bih ti cmarinu");
        ppc2.dodajPoruku(k2, "fico i ja tebi");



    }
}
