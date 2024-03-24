package zad7;

import java.util.ArrayList;

public class Bank {

    private ArrayList <Account> accounts;

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public void removeAccount(Account acc) {
        accounts.remove(acc);
    }

    public void depositMoney(Account acc, double x) {
        acc.deposit(x);
    }

    public void withdrawMoney(Account acc, double x) {
        if(acc.getBalance()-x <= 0){
            System.out.println("Sorry, you don't have enough money.");
        }else{
            acc.withdraw(x);
        }
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
