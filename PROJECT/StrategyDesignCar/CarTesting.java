package DESIGN_PATTERN.STRATEGY_DESIGN_PATTERN.StrategyDesignCar;

public class CarTesting {
    public static void main(String[] args) {
        EngineStrategy petrolStartegy = new PetrolEngineStrategy();

        EngineStrategy batteryStartegy = new BatteryEngineStrategy();

        /// Creating Car Testing

        XUV700P xuv700P = new XUV700P(petrolStartegy);

        XUV300B xuv300B = new XUV300B(batteryStartegy);

        XUV400P xuv400P = new XUV400P(petrolStartegy);

        /// Testing XUV300B
        System.out.println("BatteryInfo XUV300B: ");
        System.out.println(xuv300B.engineStrategy.getFuel());
        System.out.println("Engine Type:");
        System.out.println(xuv300B.engineStrategy.getEnginetype());

        //Testing XUV700P
        System.out.println("BatteryInfo XUV700P: ");
        System.out.println(xuv700P.engineStrategy.getFuel());
        System.out.println("Engine Type:");
        System.out.println(xuv700P.engineStrategy.getEnginetype());


        //Testing XUV400P
        System.out.println("BatteryInfo XUV400P: ");
        System.out.println(xuv400P.engineStrategy.getFuel());
        System.out.println("Engine Type:");
        System.out.println(xuv400P.engineStrategy.getEnginetype());
    }
}
