public class Darker extends Command {
    public Darker(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        light.darker();
    }

}