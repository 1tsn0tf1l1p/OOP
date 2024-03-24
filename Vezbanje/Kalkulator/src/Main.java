package main;

import java.util.Scanner;

public class Main {

    static String ispisRezultata(double[] results) {
        StringBuilder stringBuilder = new StringBuilder();
        for (double result : results)
            stringBuilder.append(result).append(" ");
        return stringBuilder.toString();
    }

    static int obradiLiniju(String line, double[] results, int lastResultIndex) {
        String[] a = line.split(" ");
        double s, t, x;
        int i;
        switch (a[0].toLowerCase()) {
            case "sum":
                s = Double.parseDouble(a[1]);
                t = Double.parseDouble(a[2]);
                x = s + t;
                System.out.println(x);
                results[++lastResultIndex] = x;
                break;
            case "sub":
                s = Double.parseDouble(a[1]);
                t = Double.parseDouble(a[2]);
                x = s - t;
                System.out.println(x);
                results[++lastResultIndex] = x;
                break;
            case "mult":
                s = Double.parseDouble(a[1]);
                t = Double.parseDouble(a[2]);
                x = s * t;
                System.out.println(x);
                results[++lastResultIndex] = x;
                break;
            case "div":
                s = Double.parseDouble(a[1]);
                t = Double.parseDouble(a[2]);
                x = s / t;
                System.out.println(x);
                results[++lastResultIndex] = x;
                break;
            case "last":
                System.out.println(results[lastResultIndex]);
                break;
            case "first":
                System.out.println(results[0]);
                break;
            case "print":
                i = Integer.parseInt(a[1]);
                System.out.println(results[i]);
                break;
            case "print-all":
                System.out.println(ispisRezultata(results));
                break;
            case "remove":
                --lastResultIndex;
                break;
            default:
                System.out.println("Nepostojeca komanda");
        }
        return lastResultIndex;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] results = new double[100];
        int index = -1;
        while (true) {
            String line = in.nextLine();
            if (line.equalsIgnoreCase("exit"))
                break;
            index = obradiLiniju(line, results, index);
        }
        in.close();
    }

}
