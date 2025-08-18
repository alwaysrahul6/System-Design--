package DESIGN_PATTERN.COMMAND_DESIGN_PATTERN;

public class FanCommand implements Command{

    private final Fan fan;

    public FanCommand(Fan f){
        this.fan = f;
    }

    @Override
    public void execute() {
        fan.on();
    }

    @Override
    public void undo() {
        fan.off();
    }
}
