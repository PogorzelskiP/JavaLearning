package JavaStart.ObjectPrograming1.PayrollCalculator;

public class Employee {
    private String name,Surname;
    private double salary;

    public Employee(String name, String surname, double salary) {
        this.name = name;
        Surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
