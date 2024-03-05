package paketString;

public class Zadatak5 {
    public static void main(String[] args) {
        String s1 = "abcd 10 dsa";
        String niz[] = s1.split(" ");

        for(String s:niz){
            System.out.println(s);
        }

        String s2 = "abc.10.dsa";
        String niz2[] = s2.split("\\.");

        for(String s:niz2){
            System.out.println(s);
        }

        String s3 = "abc@10!asd,15";
        String niz3[] = s3.split("[@!,]");

        for(String s:niz3){
            System.out.println(s);
        }
    }
}
