public class LeftCmd implements Command{

    private Car car;

    public LeftCmd(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.left();
    }


}
