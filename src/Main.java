import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Invoker invoker = new Invoker();
        List<Command> commandList = new ArrayList<>();


        Command forward = new FwdCmd(car);
        Command back = new BackCmd(car);
        Command left = new LeftCmd(car);
        Command right = new RightCmd(car);

        invoker.invoke(forward);
        commandList.add(forward);


        invoker.invoke(back);
        commandList.add(back);

        invoker.invoke(left);
        commandList.add(left);

        for( var cmd : commandList){
            invoker.invoke(cmd);
        }












    }
}