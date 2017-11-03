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
     }

    public static EmployeeWarehouse getInstance(){
        return INSTANCE;
    }


    public void add(String ... empData){

Employee employee=new Employee(getIdNum(),empData[0],empData[1],empData[2],empData[3],empData[4],empData[5]);
        employees.add(employee);
    }

    public Employee get(int idNum){
        for(Employee employee: employees){
            if(employee.getEmployeeId() == idNum)
                return employee;
        }
        return null;
    }



    public int size(){
        return employees.size();
    }
}
