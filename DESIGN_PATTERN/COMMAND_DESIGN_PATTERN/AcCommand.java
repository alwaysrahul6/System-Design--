package DESIGN_PATTERN.COMMAND_DESIGN_PATTERN;

public class AcCommand implements Command{
  
    private Ac ac;

    public AcCommand(Ac a){
        this.ac = a;
    }


    @Override
    public void execute() {
        ac.On();
    }

    @Override
    public void undo() {
    ac.Off();
    }
}

