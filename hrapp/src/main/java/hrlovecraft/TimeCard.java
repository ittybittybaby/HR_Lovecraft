package hrlovecraft;

import java.time.LocalDateTime;

public class TimeCard {

    private LocalDateTime timeIn;
    private LocalDateTime timeOut;
    private long employeeId;

    public void clockIn() {
        this.timeIn = LocalDateTime.now();
    }

    public void clockOut() {
        this.timeOut = LocalDateTime.now();
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
}
