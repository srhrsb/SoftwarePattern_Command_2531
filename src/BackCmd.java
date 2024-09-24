public class BackCmd implements Command {
    private Car car;

    public BackCmd(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.back();
    }
}
