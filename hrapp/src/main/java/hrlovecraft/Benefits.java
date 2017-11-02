package hrlovecraft;

public class Benefits {
    private int sickDays;
    private int vacationDays;
    private boolean hasHealthcare;
    private boolean hasRetirementPlan;


    public Benefits() {
        this.sickDays = 7;
        this.vacationDays = 7;
        this.hasHealthcare = false;
        this.hasRetirementPlan = false;
    }

    public Benefits(int sickdays, int vacationDays, boolean hasHealthCare, boolean hasRetirementPlan) {
        this.sickDays = sickdays;
        this.vacationDays = vacationDays;
        this.hasHealthcare = hasHealthCare;
        this.hasRetirementPlan = hasRetirementPlan;
    }

    public int getSickDays() {
        return sickDays;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public boolean getHasHealthcare() {
        return hasHealthcare;
    }

    public boolean getHasRetirementPlan() {
        return hasRetirementPlan;
    }

    public void setSickDays(int number) {
        this.sickDays = number;
    }

    public void setBenefitPackageBySalaryTier(){}

    public void setVacationDays(int number) {
        this.vacationDays = number;
    }
//
//    public void setBenefitPackageBySalaryTier(enum salaryTier) {
//        switch (salaryTier) {
//            case "low":
//                hasHealthcare = false;
//                hasRetirementPlan = false;
//                break;
//            case "mid":
//                hasHealthcare = true;
//                hasRetirementPlan = false;
//                break;
//            case "high":
//                hasHealthcare = true;
//                hasRetirementPlan = true;
//                break;
//        }
//    }
}