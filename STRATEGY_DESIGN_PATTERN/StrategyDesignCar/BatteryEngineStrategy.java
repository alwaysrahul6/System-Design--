package DESIGN_PATTERN.STRATEGY_DESIGN_PATTERN.StrategyDesignCar;

public class BatteryEngineStrategy implements EngineStrategy{

    @Override
    public String getEnginetype() {
        return "Battery";
    }

    @Override
    public String getFuel() {
        return "30%";
    }

}
