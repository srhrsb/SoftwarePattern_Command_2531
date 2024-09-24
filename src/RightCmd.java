public class RightCmd implements Command{

    private Car car;

    public RightCmd(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.right();
    }
}
