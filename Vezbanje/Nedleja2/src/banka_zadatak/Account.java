package banka_zadatak;

public class Account {

    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double ammount) {
        this.balance = this.balance + ammount;
    }

    public void withdraw(double ammount) {
        if(this.balance-ammount < 0) {
            System.out.println("Nemate dovoljno sretsva na racunu");
        }else {
            this.balance = this.balance - ammount;
        }
    }

    public void getAccountInfo() {
        System.out.println("Ime: "+this.name+", Broj racuna: "+this.accountNumber+", stanje: "+this.balance);
    }
}
