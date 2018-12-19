package employeesMoneyTransfer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeReader {
    private FileReader reader = new FileReader();


    public List<Employee> getEmployees(String path) {
        List<Employee> employees = new ArrayList<>();
        List<String> employeeLine = reader.getLines(path);
        for (String line : employeeLine) {
            Employee employee = getEmployee(line);
            employees.add(employee);
        }

        return employees;
    }

    public Employee getEmployee(String line) {
        String[] part = line.split(";");
        List<String> parts = Arrays.asList(part);
        String name = parts.get(0);
        String department = parts.get(1);
        String salaryString = parts.get(2);
        Integer salary = Integer.valueOf(salaryString);
        String bankAcount = parts.get(3);
        Employee employee = new Employee(name, salary, bankAcount, department);
        return employee;
    }
}
