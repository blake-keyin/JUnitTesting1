package JUnit1.Testing;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.firstName + this.lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int new_salary) {
        this.salary = new_salary;
    }

    public int getAnnualSalary() {
        return (this.salary * 12);
    }

    public int raiseSalary(int percent) {
        this.salary = (this.salary / 100) * (100 + percent);
        return this.salary;
    }

    public String toString() {
        return("Employee: id=" + getID() + ", name=" + getFirstName() + ", lastname= " + getLastName() + ", salary= " + getSalary());
    }
}

