package hrlovecraft;

public class Benefits {
    private int sickDays;
    private int vacationDays;
    private boolean hasHealthcare;
    private boolean hasRetirementPlan;


    public Benefits(SalaryTier salaryTier) {
        this.sickDays = 7;

        if (salaryTier.equals("High")) {
            this.vacationDays = 21;
            this.hasHealthcare = true;
            this.hasRetirementPlan = true;
        } else if (salaryTier.equals("MEDIUM")) {
            this.vacationDays = 7;
            this.hasHealthcare = true;
            this.hasRetirementPlan = false;
        } else {
            this.vacationDays = 7;
            this.hasHealthcare = false;
            this.hasRetirementPlan = false;
        }
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

    public void setBenefitPackageBySalaryTier(SalaryTier salaryTier) {
        switch (salaryTier) {
            case LOW:
                this.vacationDays = 7;
                this.hasHealthcare = false;
                this.hasRetirementPlan = false;
                break;
            case MEDIUM:
                this.vacationDays = 7;
                this.hasHealthcare = true;
                this.hasRetirementPlan = false;
                break;
            case HIGH:
                this.vacationDays = 21;
                this.hasHealthcare = true;
                this.hasRetirementPlan = true;
                break;
            case TERMINATED:
                this.vacationDays = 0;
                this.sickDays = 0;
                this.hasHealthcare = false;
                this.hasRetirementPlan = false;
                break;
        }
    }

    public void setVacationDays(int number) {
        this.vacationDays = number;
    }

}