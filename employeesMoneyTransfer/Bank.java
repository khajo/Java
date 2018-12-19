package employeesMoneyTransfer;

import java.util.ArrayList;
import java.util.List;

public class Bank {


    public String transfer(Integer salary, String bankAcount) {
        String display = "Transfer successful: " + salary + " € to account " + bankAcount;
        return display;
    }


    public List<String> transferList(List<Employee> employees) {
        List<String> trasferList = new ArrayList<>();
        for (Employee employee : employees) {
            Integer salary = employee.getSalary();
            String bankacount = employee.getBankAcount();
            String trasfer = transfer(salary, bankacount);
            trasferList.add(trasfer);
        }

        return trasferList;
    }

    public void display(List<String> trasferList) {
        for (String trasfer : trasferList) {
            System.out.println(trasfer);
        }
    }
}
