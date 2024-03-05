package string;

public class Stringovi {

    public static void main(String[] args) {

        // Moramo da dodelimo vrednost da bi je promenili

        String s = "aaaa";

        String s2 = "aaaa";
        String s1 = new String("aaaa");
        System.out.println(s1);

        System.out.println(s1.equals(s));

        StringBuilder sb = new StringBuilder();
        sb.append("Brojevi od 0 do 499:");
        sb.append("\n");

        for (int i = 0; i < 500; i++) {
            sb.append(i);
            sb.append("\n");
        }

        System.out.println(sb.toString());


        int test = Integer.max(200, 300);

        System.out.println(test);

    }

}
