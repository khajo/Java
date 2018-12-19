package employeesMoneyTransfer;

import java.util.List;

public class TotalAmount {


    public Integer getAmount(List<Employee> employees) {
        Integer amount = 0;
        for (Employee employee : employees) {
            Integer salary = employee.getSalary();
            amount += salary;
        }

        return amount;
    }
}
