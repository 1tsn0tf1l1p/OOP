package zad7;

public class Account {

    private String name;
    private char sex;
    private String accountId;
    private double balance;

    public Account(String name, char sex, String accountId, double balance) {
        this.name = name;
        this.sex = sex;
        this.accountId = accountId;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double x) {
        this.balance = this.balance-x;
    }

    public void deposit(double x) {
        this.balance = this.balance+x;
    }

    public void getAccountInfo() {
        System.out.println("Name: "+this.name);
        System.out.println("Sex: "+this.sex);
        System.out.println("Account ID: "+this.accountId);
        System.out.println("Balance: "+this.balance);
    }

}
