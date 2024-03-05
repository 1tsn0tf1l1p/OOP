package paketString;

public class Primer1 {

    public static void main(String[] args) {

        String s1 = new String("abcd");
        String s2 = new String("abcd");
        System.out.println(s1 == s2);

        String s3 = "abcd";

        String s5 = "abc";
        String s6 = "abc";
        String s7 = s6+"";

        System.out.println(s5==s7);



    }

}
