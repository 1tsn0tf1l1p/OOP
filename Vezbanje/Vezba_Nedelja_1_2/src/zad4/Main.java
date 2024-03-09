package zad4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circle c1 = new Circle(sc.nextDouble());

        System.out.println("Area is: "+c1.getArea());
        System.out.println("Circumference is: "+c1.getCircumference());

    }
}
