import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("Hello stranger, talk to me!");

        while(true) {

            System.out.println("What is your name?");
            stringBuilder.append(scanner.nextLine());
            System.out.println("Great "+stringBuilder+", my name is assistant!");
            stringBuilder.setLength(0);
            stringBuilder.append("And how old are you?");
            System.out.println(stringBuilder);

        }

    }

}
