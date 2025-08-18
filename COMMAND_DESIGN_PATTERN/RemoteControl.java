package DESIGN_PATTERN.COMMAND_DESIGN_PATTERN;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private static final int  NUM_BUTTONS  = 4;

    private final Command[] buttons;

    private final boolean [] buttonsPressed;

    public RemoteControl(){
        buttons = new Command[ NUM_BUTTONS ];

        buttonsPressed = new boolean[ NUM_BUTTONS ];
    }

    public void setCommand(int idx , Command cmd){
        if (idx >= 0 && idx <  NUM_BUTTONS ){
            buttons[idx] = cmd;
            buttonsPressed[idx] = false;
        }
    }

    public void pressButton(int idx) {
        if (idx >= 0 && idx <  NUM_BUTTONS  && buttons[idx] != null){
            if (!buttonsPressed[idx]){
                buttons[idx].execute();
            }else {
                buttons[idx].undo();
            }
            buttonsPressed[idx] = !buttonsPressed[idx];
        }else {
            System.out.println("No Command Assigned at Button:" + idx);
        }
    }
}
