import java.util.ArrayList;
import java.util.List;

public class ChatApp {
    public static void main(String[] args) {

        Registracija r = new Registracija();
        r.registrujKorisnika("peraperic123", "pp123", "1234567Pp", "1234567Pp");
        r.registrujKorisnika("markom", "markomarkovic1", "lozinka123L", "lozinka123L");
        r.registrujKorisnika("mikam", "mikic", "Lozinka1", "Lozinka1");
        r.registrujKorisnika("anaaa", "anap123", "123Anaaa", "123Anaaa");
        r.registrujKorisnika("mladen", "mladja", "mladenDemla1", "mladenDemla1");
        r.registrujKorisnika("peraperic123", "pp123", "1234567Pp", "1234567Pp");
        r.registrujKorisnika("peraperic123", "ppp123", "1234567p", "1234567p");

        r.prijavaKorisnika("pera", "1234567Pp");



    }
}
