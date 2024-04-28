package zad7;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        // System.out.println(rand.nextLong());

        Bank bank = new Bank();

        Account p1 = new Account("Zoran", 'M', "3676162549911417619", 123235);
        Account p2 = new Account("Goran", 'M', "8549300716711166465", 2929349);
        Account p3 = new Account("Marko", 'M', "4962277416178250235", 212);
        Account p4 = new Account("Filip", 'M', "6191517032353347556", 1000000);
        Account p5 = new Account("Miona", 'F', "1770884794950277767", 1023532);
        Account p6 = new Account("Milica", 'F', "7566561725303519686", 123);

        bank.addAccount(p1);
        bank.addAccount(p2);
        bank.addAccount(p3);
        bank.addAccount(p4);
        bank.addAccount(p5);
        bank.addAccount(p6);

        ArrayList<Account> accounts = bank.getAccounts();

        for(Account acc:accounts) {
            System.out.println(acc.getAccountInfo());
        }


    }
}
