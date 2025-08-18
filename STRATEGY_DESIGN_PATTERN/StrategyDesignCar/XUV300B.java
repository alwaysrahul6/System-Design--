package DESIGN_PATTERN.STRATEGY_DESIGN_PATTERN.StrategyDesignCar;

public class XUV300B extends Car implements BatteryEngine {
    public EngineStrategy engineStrategy;

    public XUV300B(EngineStrategy strategy){
        this.engineStrategy = strategy;
    }

    public String getInfo(){
        return "Engine" + engineStrategy.getEnginetype() + "Fuel: " + engineStrategy.getFuel();
    }

    @Override
    public String getBattery() {
        return "Battery Engine ";
    }
}
