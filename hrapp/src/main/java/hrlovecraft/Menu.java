package hrlovecraft;

public class Menu {

    private static Menu INSTANCE = new Menu();

    public static Menu getMenu() {
        return INSTANCE;
    }

    private Menu() {

    }


    public void printWelcomeMessage() {
        System.out.println("*****************************\n" +
                           "Welcome to the HR application\n" +
                           "*****************************\n\n" +
                           "What would you like to do today\n" +
                           "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                           "1) Hire New Employee\n" +
                           "2) Manage Current Employees");
        Console.getConsole().handleWelcomeMessageInput();
    }

    public void hireNewEmployeeMenu() {
        System.out.println("Hire New Employee\n"
                         + "Please fill out the following information\n");
    }

    public void setEmployeeName(){
        System.out.println("Name: ");
    }

    public void setEmployeeStAddress(){
        System.out.println("Street Address(House number and st. name): ");
    }

    public void setEmployeeCity(){
        System.out.println("City: ");
    }

    public void setEmployeeState(){
        System.out.println("State: ");
    }

    public void setEmployeePhoneNumber(){
        System.out.println("Phone: ");
    }

    public void setEmployeeEmail(){
        System.out.println("Email: ");
    }

    public void setEmployeeDepartment(){
        System.out.println("Department: ");
    }

    public void setEmployeeStatus(){
        System.out.println("Part time or Full time(PT/FT): ");
    }

    public void setEmployeeHireDate(){
        System.out.println("Hire Date: ");
    }

    public void setEmployeeSalaryTier(){
        System.out.println("Salary Tier: ");
    }

    public void setEmployeePosition(){
        System.out.println("Position: ");
    }

    public void chooseEmployeeToManage(){
        System.out.println("Enter Employee ID to update: ");
    }

    public void manageEmployeeMenu(){
        System.out.println("What would you like to update?\n" +
                           "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                           "1)Personal Information\n" +
                           "2)Department\n" +
                           "3)Status(FT/PT)\n" +
                           "4)Termination Date\n" +
                           "5)Salary Tier\n" +
                           "6)Benefits\n" +
                           "7)Position");
    }

    public void updatePersonalInfo(){
        System.out.println("What would you like to update?\n" +
                           "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                           "1)Name\n" +
                           "2)Address\n" +
                           "3)Phone Number\n" +
                           "4)Email");
    }

    public void setEmployeeTerminationDate(){
        System.out.println("Termination Date: ");
    }

//    public void setEmployeeBenefits(){
//        System.out.println("Would you like benefits?");
//    }

    public void manageCurrentEmployees() {
        System.out.println("Manage Current Employees\n"
                + "1) Choose a Department"
                + "2) Choose a specific employee");
    }


    // depending on choice, prompt user to input Department name or Employee ID
    // now prompt user to either view or manage Department or Specific Employee
    // if view, need to give options of what to view (e.g. paystubs, benefits, contact information etc.)
    // if manage, need to give options of what to manage (e.g. paystubs, benefits, update contact information, etc.)




}
