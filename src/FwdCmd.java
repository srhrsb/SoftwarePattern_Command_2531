public class FwdCmd implements Command{
    private Car car;

    public FwdCmd(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.forward();
    }
}
