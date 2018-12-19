package employeesMoneyTransfer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HighestSalaryTest {
    private List<Employee> employees = Arrays.asList(new Employee("khajag",2000,"AT1230984723984623","It"),
            new Employee("Peter",3000,"AT234876295629","Teacher"));

    @Test
    void testGetHighestSalary() {
        HighestSalary highestSalary = new HighestSalary();
       Employee employee= highestSalary.getHighestSalary(employees);
        Integer hightSalaryExcepted = 3000;
       assertEquals(hightSalaryExcepted,employee.getSalary());
    }

}