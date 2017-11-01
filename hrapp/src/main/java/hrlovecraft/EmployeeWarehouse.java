package hrlovecraft;

import java.util.ArrayList;

public class EmployeeWarehouse extends Warehouse<Employee> {

    private static final EmployeeWarehouse INSTANCE=new EmployeeWarehouse();

    private ArrayList<Employee> employees=getList();

    private EmployeeWarehouse(){
        //delete loop after testing
        for (int i=1; i<10; i++)
            employees.add(new Employee(i));
    }

    public static EmployeeWarehouse getInstance(){
        return INSTANCE;
    }

    public void add(Employee employee){
        employees.add(employee);
    }

    public Employee get(int idNum){
        for(Employee employee: employees){
            if(employee.id==idNum)
                return employee;
        }
        return null;
    }

    public int size(){
        return employees.size();
    }
}
