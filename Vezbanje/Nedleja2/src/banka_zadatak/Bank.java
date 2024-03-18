package banka_zadatak;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account ac) {
        accounts.add(ac);
    }

    public void removeAccount(Account ac) {
        accounts.remove(ac);
    }


}
