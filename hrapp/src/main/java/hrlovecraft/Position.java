package hrlovecraft;

import javafx.geometry.Pos;

public enum Position {
    CEO(100), CFO(50), Manager(25), Supervisor(20), Associate(15), Janitor(10), Handler(5);

    ;

    private final double payRate;

    Position(double payRate) {this.payRate = payRate;}

    public double getPayRate() {
        return this.payRate;
    }


}
