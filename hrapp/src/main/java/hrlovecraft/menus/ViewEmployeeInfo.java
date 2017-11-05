package hrlovecraft.menus;

import hrlovecraft.Employee;

public class ViewEmployeeInfo extends Menu {

    public enum ViewEmployee{BACK, MAIN, NEW_SEARCH}

    private Employee employee;
    public ViewEmployeeInfo(Employee employee){
        super(ViewEmployee.values()/*, "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "Employee Information\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"*/);
        this.employee=employee;
    }

    @Override
    public void userSelect(String userInput) {
        switch ( ViewEmployee.valueOf(userInput)){

            case MAIN:
                MainMenu.getInstance().display();
                break;
            case BACK:break;
            case NEW_SEARCH:
                FindEmployee.getInstance().display();
                break;
        }
    }

    public void display(){
        String userInput="";
        System.out.println("NAME: " + employee.getName() +
                "\nID: " + employee.getEmployeeId() +
                "\nHIRE DATE: " + employee.getHireDate() +
                "\nADDRESS:\n" + employee.getContactInfo().getStreetAddress() +
                "\n" + employee.getContactInfo().getCity() + ", " + employee.getContactInfo().getState() +
                "\nCONTACT NUMBER: " + employee.getContactInfo().getPhoneNumber() +
                "\nEMAIL ADDRESS: " + employee.getContactInfo().getEmail() +
                "\nDEPARTEMENT: " + employee.getDepartment() +
                "\nPOSITION: " + employee.getPosition() +
                "\nSALARY TIER" + employee.getSalaryTier() +
                "\nBENEFITS: " +
                "\n   VACATION REMAINING: " + employee.getBenefits().getVacationDays() +
                "\n   SICK TIME REMAINING: " + employee.getBenefits().getSickDays() +
                "\n   ENROLLED FOR RETIREMENT: " + employee.getBenefits().getHasRetirementPlan() +
                "\n   MEDICALLY INSURED: " + employee.getBenefits().getHasHealthcare() +
                "\n");
        do{
            userInput=getUserInput();
            userInput=menuToInt(userInput.toUpperCase());
            userSelect(userInput);
        }while (!"back".equalsIgnoreCase(userInput));

    }

    @Override
    public void printMenuMessage() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "Employee Information\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

}
