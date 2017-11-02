package hrlovecraft;

public enum Position {
    Manager(25), Supervisor(20), ITManager(20), HRRepresentitive(15), MaintenenceWorker(15), Driver(15), Loader(10), Unloader(10), Reciever(10), Shipper(10), Handler(10);

    ;

    private final double payRate;

    Position(double payRate) {this.payRate = payRate;}

    public double getPayRate() {
        return this.payRate;
    }


}
