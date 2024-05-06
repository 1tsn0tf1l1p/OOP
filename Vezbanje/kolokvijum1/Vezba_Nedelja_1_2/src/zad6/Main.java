package zad6;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Zoki", "Bankar", 134000);
        Employee employee2 = new Employee("Moki", "Kombajn", 46000);

        employee1.raiseSalary(17);
        employee2.lowerSalary(2);

        employee1.printDetails();
        employee2.printDetails();


    }
}
