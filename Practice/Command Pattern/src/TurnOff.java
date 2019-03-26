public class TurnOff extends Command {

    public TurnOff(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

