package hrlovecraft.menus;

import hrlovecraft.*;


public class EmployeeUpdate extends Menu {


    public enum UpdateSelections {NAME, ADDRESS, PHONE, EMAIL, DEPARTMENT, POSITION, SALARY, RETIREMENT, INSURANCE, BACK, MAIN}

    private Employee employee;
    public EmployeeUpdate(Employee employee) {
        super(UpdateSelections.values());
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
        String salaryRange=checkSalaryTier();
        employee.setSalaryTier(SalaryTier.valueOf(salaryRange));
        System.out.println("The employee's salary tier has been updated to: "+employee.getSalaryTier());
    }

    private void updatePosition() {
        String position=checkPosition();
        employee.setPosition(Position.valueOf(position));
        System.out.println("The employee's new role is: "+employee.getPosition());
    }

    private void updateDepartment() {
        String dept=checkDepartment();
        employee.setDepartment(Department.valueOf(dept));
        System.out.println("The employee now works in: "+ employee.getDepartment());
    }

    private void updateEmail() {
        System.out.println("Enter the new email address number for the employee: ");
        String emailAddr=in.nextLine();
        while (!emailAddr.contains("@")) {
            System.out.print("\nPlease make sure your email address has an @ in it.\n\n");
            System.out.print("Enter an email address: ");
            emailAddr = in.nextLine();
        }
        employee.getContactInfo().setEmail(emailAddr);
        System.out.println("The email address has been updated to: "+employee.getContactInfo().getEmail());
    }

    private void updatePhone() {
        System.out.println("Enter the new phone number for the employee: ");
        String phoneNumber=in.nextLine();
        while (!phoneNumber.matches("\\d{10}")) {
            System.out.print("\nPlease make sure your phone number is 10 digits long.\n\n");
            System.out.print("Enter a phone number: ");
            phoneNumber = in.nextLine();
        }
        long phoneNum = Long.parseLong(phoneNumber);
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
        String state=checkState();
        employee.getContactInfo().setState(State.valueOf(state));
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
