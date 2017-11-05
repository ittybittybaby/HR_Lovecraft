package hrlovecraft;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class EmployeeWarehouse extends Warehouse<Employee> {

    private static final EmployeeWarehouse INSTANCE = new EmployeeWarehouse();

    private ArrayList<Employee> employees = getList();

    private long getIdNum(){
        if(employees.size()==0)
            return 100001;
         else return employees.get(size()-1).getEmployeeId()+1;
    }

    private EmployeeWarehouse(){
        Employee expected=new Employee(getIdNum(),"tom","123 st", "newark", "delaware", "2222222222", "zip@zippity.com");
add(expected);    }

    public static EmployeeWarehouse getInstance(){
        return INSTANCE;
    }


    public void add(String ... empData){

Employee employee=new Employee(getIdNum(),empData[0],empData[1],empData[2],empData[3],empData[4],empData[5]);
        employees.add(employee);
    }

    public Employee getById(int idNum){
        for(Employee employee: employees){
            if(employee.getEmployeeId() == idNum)
                return employee;
        }
        return null;
    }

    public ArrayList<Employee> getEmployees(String dept) {
        Department department=Department.valueOf(dept);
        ArrayList<Employee>employeeList=new ArrayList<>();
        for(Employee employee: employees){
            if(employee.getDepartment().equals(department))
                employeeList.add(employee);
        }
        return employeeList;
    }

    public int size(){
        return employees.size();
    }
}
