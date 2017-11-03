package hrlovecraft;

public class MenuPrompts {

    private static MenuPrompts INSTANCE = new MenuPrompts();

    public static MenuPrompts getMenu() {
        return INSTANCE;
    }

    private MenuPrompts() {

    }


    public void printWelcomeMessage() {
        System.out.println("*****************************\n" +
                           "Welcome to the HR application\n" +
                           "*****************************\n\n" +
                           "What would you like to do today\n" +
                           "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                           "1) Hire New Employee\n" +
                           "2) Manage Current Employees\n");
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

    public void updateEmployeeMenu(){
        System.out.println("What would you like to update?\n" +
                           "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                           "1)Personal Information\n" +
                           "2)Department\n" +
                           "3)Status(FT/PT)\n" +
                           "4)Termination Date\n" +
                           "5)Salary Tier\n" +
                           "6)Benefits\n" +
                           "7)Position\n");
    }

    public void updatePersonalInfo(){
        System.out.println("What would you like to update?\n" +
                           "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                           "1)Name\n" +
                           "2)Address\n" +
                           "3)Phone Number\n" +
                           "4)Email\n");
    }

    public void setEmployeeTerminationDate(){
        System.out.println("Termination Date: ");
    }

    public void setEmployeeBenefitsMenu(){
        System.out.println("Benefits\n" +
                           "~~~~~~~~\n" +
                           "1)Healthcare plan\n" +
                           "2)Retirement plan\n" +
                           "3)Sick days\n" +
                           "4)Vacation days\n");
    }

    public void setHealthcarePlan(){
        System.out.println("Would you like a Healthcare plan?(y/n): ");
    }

    public void setRetirementPlan(){
        System.out.println("Would you like a Retirement plan?(y/n): ");
    }

    public void setSickDays(){
        System.out.println("Change total sick days to: ");
    }

    public void setVacationDays(){
        System.out.println("Change total vacation days to: ");
    }

    public void manageEmployeeMenu(){
        System.out.println("What would you like to do?\n" +
                           "~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                           "1)Update Employee information\n" +
                           "2)Edit Timecard\n" +
                           "3)View paystubs\n");
    }

    public void timecardMenu(){
        System.out.println("What would you like to do?\n" +
                           "~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                           "1)Clock in\n" +
                           "2)Clock out\n" +
                           "3)View timecard\n");
    }

    public void setClockIn(){
        System.out.println("Clock in time: ");
    }

    public void setClockOutTime(){
        System.out.println("Clock out time: ");
    }

    public void viewTimecard(){
        System.out.println("Enter the date or dates you would like to view: ");
    }

    public void viewPaysub(){
        System.out.println("Enter the pay period or pay periods you would like to view: ");
    }




    // depending on choice, prompt user to input Department name or Employee ID
    // now prompt user to either view or manage Department or Specific Employee
    // if view, need to give options of what to view (e.g. paystubs, benefits, contact information etc.)
    // if manage, need to give options of what to manage (e.g. paystubs, benefits, update contact information, etc.)




}
