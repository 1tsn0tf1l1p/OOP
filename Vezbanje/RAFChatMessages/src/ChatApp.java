public class ChatApp {
    public static void main(String[] args) {

        Emojis emojis = new Emojis();

        emojis.dodajEmoji("idk", "(ツ)");
        emojis.dodajEmoji("smeh", ":)");
        emojis.dodajEmoji("tuzan", ":(");
        emojis.dodajEmoji("kita", ":(");
        emojis.dodajEmoji("xd", "xDDD");

        Poruka tp1 = new TekstualnaPoruka("Jovan Tosic", "imam pametan mozak");
        Poruka tp2 = new TekstualnaPoruka("Maja Cvijan", "grdoooba");

        Poruka ep1 = new EmojiPoruka("Filip Cobanin", emojis.getEmojis().get(1));
        Poruka ep2 = new EmojiPoruka("Filip Cobanin", emojis.getEmojis().get(2));

        Poruka kp1 = new KombinovanaPoruka("Pera Peric");
        Poruka kp2 = new KombinovanaPoruka("Marko Mladenovic");

        Poruka ebt1 = new EmojijiBezTeksta("Pera Peric");
        Poruka ebt2 = new EmojijiBezTeksta("Zoran Mitic");

        Chat chat = new Chat();

        chat.dodajPorukuUChat(tp1);
        chat.dodajPorukuUChat(tp2);
        chat.dodajPorukuUChat(ep1);
        chat.dodajPorukuUChat(ep2);
        chat.dodajPorukuUChat(kp1);
        chat.dodajPorukuUChat(kp2);
        chat.dodajPorukuUChat(ebt1);
        chat.dodajPorukuUChat(ebt2);

        for(Poruka p : chat.getSvePoruke()) {
            System.out.println(p.formirajIspis());
        }







    }
}
