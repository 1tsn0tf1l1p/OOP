package zad6;

public class Employee {

    private String name;
    private String jobTitle;
    private int salary;

    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(double percentage) {
        this.salary = (int) (this.salary + this.salary*(percentage/100));
    }

    public void lowerSalary(double percentage) {
        this.salary = (int) (this.salary - this.salary*(percentage/100));
    }

    public void printDetails() {
        System.out.println("Name: "+this.name);
        System.out.println("Job Title: "+this.jobTitle);
        System.out.println("Salary: "+this.salary);
    }

}
