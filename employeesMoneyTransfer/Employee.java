package employeesMoneyTransfer;

import java.util.Objects;

public class Employee {
    private String name;
    private Integer salary;
    private String bankAcount;
    private String department;

    public Employee(String name, Integer salary, String bankAcount, String department) {
        this.name = name;
        this.salary = salary;
        this.bankAcount = bankAcount;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getBankAcount() {
        return bankAcount;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(salary, employee.salary) &&
                Objects.equals(bankAcount, employee.bankAcount) &&
                Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, bankAcount, department);
    }

    @Override
    public String toString() {
        return "Highest salary employee: " +
                name +
                " form " + department + " department" +
                " with salary " + salary +
                " Euro"
                ;
    }
}

//Highest salary employee: Peter from Cleaning with 2600€