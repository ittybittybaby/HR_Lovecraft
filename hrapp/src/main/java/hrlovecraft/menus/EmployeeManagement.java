package hrlovecraft.menus;

import hrlovecraft.*;

public class EmployeeManagement extends Menu {

    public enum EmpManagement {VIEW, UPDATE, PAYROLL_MANAGEMENT, TERMINATE, TIMECARD, MAIN, BACK}

    private Employee employee;

    public EmployeeManagement(Employee employee) {
        super(EmpManagement.values());
        this.employee = employee;
    }

    @Override
    public void userSelect(String userInput) {

        switch (EmpManagement.valueOf(userInput)) {

            case VIEW:
                viewEmployee();
                break;
            case UPDATE:
                updateInformation();
                break;
            case PAYROLL_MANAGEMENT:
                payrollManagement();
                break;
            case TERMINATE:
                terminate();
                break;
            case TIMECARD:
                timecard();
                break;
            case MAIN:
                MainMenu.getInstance().display();
                break;
            case BACK:
                FindEmployee.getInstance().display();
                break;
            default:
                display();

        }
    }

    private void terminate() {
        String employeeName = employee.getName();
        employee.setDepartment(Department.Terminated);
        employee.setPosition(Position.Terminated);
        employee.getBenefits().setBenefitPackageBySalaryTier(SalaryTier.TERMINATED);
        employee.setSalaryTier(SalaryTier.TERMINATED);
        System.out.println("\n" + employeeName + " has been successfully terminated.\n");
    }

    private void viewEmployee() {
        new ViewEmployeeInfo(employee).display();
    }

    private void payrollManagement() {
        new PayrollManagement(employee).display();
    }

    private void updateInformation() {
        new EmployeeUpdate(employee).display();
        display();


    }

    public void printMenuMessage() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "What would you like to manage\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "Name: " + employee.getName() + "    " + "ID: " + employee.getEmployeeId());
    }

    public void timecard() {
        new TimeCardManager(employee).display();
    }

}
