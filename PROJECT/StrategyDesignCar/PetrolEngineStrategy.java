package DESIGN_PATTERN.STRATEGY_DESIGN_PATTERN.StrategyDesignCar;

public class PetrolEngineStrategy implements EngineStrategy {


    @Override
    public String getEnginetype() {
        return "Petrol";
    }

    @Override
    public String getFuel() {
        return "30L";
    }
}
