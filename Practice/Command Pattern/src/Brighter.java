public class Brighter extends Command{
    public Brighter(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        light.brighter();
    }
}

