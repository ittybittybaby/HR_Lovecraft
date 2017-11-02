package hrlovecraft;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoField.MINUTE_OF_DAY;
import static java.time.temporal.ChronoField.MINUTE_OF_HOUR;

public class TimeCard {

    private LocalDateTime timeIn;
    private LocalDateTime timeOut;
    private long employeeId;


    public TimeCard(String timeIn){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy-HHmm");
        this.timeIn= LocalDateTime.parse(timeIn, formatter);
        timeOut=LocalDateTime.now();
    }


    public LocalDateTime getTimeIn() {
        return timeIn;
    }

    public LocalDateTime getTimeOut() {
        return timeOut;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public double getHoursWorked(){
       return (getTimeOut().get(MINUTE_OF_DAY)-getTimeIn().get(MINUTE_OF_DAY))/60;
    }

    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy-HHmm");
        return  getTimeIn().format(formatter);
    }

}
