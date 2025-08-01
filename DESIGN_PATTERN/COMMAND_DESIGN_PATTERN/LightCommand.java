package DESIGN_PATTERN.COMMAND_DESIGN_PATTERN;

public class LightCommand implements Command{
    private final Light light;

    public LightCommand(Light l){
        this.light = l;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
