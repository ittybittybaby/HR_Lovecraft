package hrlovecraft.menus;

import hrlovecraft.Employee;

public class ViewPayPeriod {

    private Employee employee;

    public ViewPayPeriod(Employee employee) {
        this.employee = employee;
    }

    public void printAllPaystubs(){
        String[] empPaystubs = employee.getAllPaystubRecords();
        for(String str : empPaystubs)
            System.out.println(str);
    }


}
