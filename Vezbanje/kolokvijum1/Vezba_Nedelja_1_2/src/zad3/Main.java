package zad3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle(sc.nextInt(), sc.nextInt());

        int area = r1.getHeight()*r1.getWidth();

        int perimeter = r1.getHeight()*2+r1.getWidth()*2;

        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);

    }
}
