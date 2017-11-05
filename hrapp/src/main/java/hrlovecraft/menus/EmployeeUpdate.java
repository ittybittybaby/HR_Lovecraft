package hrlovecraft.menus;

import hrlovecraft.*;


public class EmployeeUpdate extends Menu {


    public enum UpdateSelections {NAME, ADDRESS, PHONE, EMAIL, DEPARTMENT, POSITION, SALARY, RETIREMENT, INSURANCE, BACK, MAIN}

    private Employee employee;
    public EmployeeUpdate(Employee employee) {
        super(UpdateSelections.values()/*, "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "What would you like to update\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "Name: " + employee.getName() + "    " + "ID: " + employee.getEmployeeId()*/);
        this.employee = employee;
    }

    @Override
    public void userSelect(String userInput) {
        switch (UpdateSelections.valueOf(userInput)){
            case NAME: updateName();
                break;
            case ADDRESS: updateAddress();
                break;
            case PHONE: updatePhone();
                break;
            case EMAIL:updateEmail();
                break;
            case DEPARTMENT:updateDepartment();
                break;
            case POSITION:updatePosition();
                break;
            case SALARY: updateSalary();
                break;
            case RETIREMENT:retirement();
                break;
            case INSURANCE: insurance();
            case BACK:
                break;
            case MAIN: MainMenu.getInstance().display();
            default:display();
        }
    }

    private void insurance() {
    }

    private void retirement() {

    }

    private void updateSalary() {
        System.out.println("Enter the new salary tier for the employee: ");
        String salaryRange=in.nextLine();
        employee.setSalaryTier(SalaryTier.valueOf(salaryRange));
        System.out.println("The employee's salary tier has been updated to: "+employee.getSalaryTier());
    }

    private void updatePosition() {
        System.out.println("Enter the new position name for the employee: ");
        String position=in.nextLine();
        employee.setPosition(Position.valueOf(position));
        System.out.println("The employee's new role is: "+employee.getPosition());
    }

    private void updateDepartment() {
        System.out.println("Enter the new department name for the employee: ");
        String dept=in.nextLine();
        employee.setDepartment(Department.valueOf(dept));
        System.out.println("The employee now works in: "+ employee.getDepartment());
    }

    private void updateEmail() {
        System.out.println("Enter the new email address number for the employee: ");
        String emailAddr=in.nextLine();
        employee.getContactInfo().setEmail(emailAddr);
        System.out.println("The email address has been updated to: "+employee.getContactInfo().getEmail());
    }

    private void updatePhone() {
        System.out.println("Enter the new phone number for the employee: ");
        long phoneNum=in.nextLong();
        employee.getContactInfo().setPhoneNumber(phoneNum);
        System.out.println("The phone number has been updated to: "+employee.getContactInfo().getPhoneNumber());
    }

    private void updateAddress() {
        System.out.print("\nEnter the street address: ");
        String addr=in.nextLine();
        employee.getContactInfo().setStreetAddress(addr);
        System.out.print("Enter the new city: ");
        addr=in.nextLine();
        employee.getContactInfo().setCity(addr);
        boolean flag=false;
        while(!flag){
            try{
                System.out.print("Enter the State: ");
                addr=in.nextLine();
                State state=State.valueOf(addr);
                employee.getContactInfo().setState(state);
                flag=true;
            }catch (Exception e){
                System.out.println("Invalid State Entered.");
            }
        }
        System.out.println("Address Update Successful.");
    }

    private void updateName() {
        System.out.println("Enter the new name for the employee: ");
        String name=in.nextLine();
        employee.setName(name);
        System.out.println("The employee's name has been updated to "+employee.getName());
    }

    public void printMenuMessage(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "What would you like to manage\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "Name: " + employee.getName() + "    " + "ID: " + employee.getEmployeeId());}

}
