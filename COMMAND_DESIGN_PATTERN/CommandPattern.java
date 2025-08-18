package DESIGN_PATTERN.COMMAND_DESIGN_PATTERN;

public class CommandPattern {
    public static void main(String[] args) {

        Light light = new Light();

        Fan fan = new Fan();

        Ac ac = new Ac();

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(0 , new LightCommand(light));

        remoteControl.setCommand(1 , new FanCommand(fan));

        remoteControl.setCommand(2 , new AcCommand(ac));

        System.out.println("----Tooggeling Light Behaivours: ");

//        System.out.println("Light is On: ");

        remoteControl.pressButton(0);

//        System.out.println("Light is Off: ");
        remoteControl.pressButton(0);

        System.out.println("----Tooggeling Fan Behaivours: ");

        remoteControl.pressButton(1);

        remoteControl.pressButton(1);

        System.out.println("-----Toggeling Ac Behaviours------");

        remoteControl.pressButton(2);

        remoteControl.pressButton(2);

    }
}
