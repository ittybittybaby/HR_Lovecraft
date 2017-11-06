package hrlovecraft;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class EmployeeWarehouse extends Warehouse<Employee> {

    private static final EmployeeWarehouse INSTANCE = new EmployeeWarehouse();

    private ArrayList<Employee> employees = getList();

    private long getIdNum() {
        if (employees.size() == 0)
            return 100001;
        else return employees.get(size() - 1).getEmployeeId() + 1;
    }

    private EmployeeWarehouse() {
        Employee employee = generateEmployee();
    }

    public static EmployeeWarehouse getInstance() {
        return INSTANCE;
    }


    public void add(String... empData) {

        Employee employee = new Employee(getIdNum(), empData[0], empData[1], empData[2], empData[3], empData[4], empData[5]);
        employees.add(employee);
    }

    public Employee getById(int idNum) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == idNum)
                return employee;
        }
        return null;
    }

    public ArrayList<Employee> getEmployees(String dept) {
        Department department = Department.valueOf(dept);
        ArrayList<Employee> employeeList = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department))
                employeeList.add(employee);
        }
        return employeeList;
    }

    public int size() {
        return employees.size();
    }

    private Employee generateEmployee() {
        Employee employee = new Employee(1, "tom", "123 st", "newark", "delaware", "2222222222", "zip@zippity.com");
        PaystubWarehouse psw = employee.getPSW();
        TimeCard timeCard1 = new TimeCard("04-20-1999-0420");
        TimeCard timeCard2 = new TimeCard("04-21-1999-0420");
        Paystub paystub1 = new Paystub(1, 100, LocalDateTime.now(), LocalDateTime.now().plusDays(1));
        Paystub paystub2 = new Paystub(1, 100, LocalDateTime.now(), LocalDateTime.now().plusDays(2));
        employee.submitTimeCard(timeCard1);
        employee.submitTimeCard(timeCard2);
        psw.add(paystub1);
        psw.add(paystub2);

        this.add(employee);

        return employee;
    }
}
