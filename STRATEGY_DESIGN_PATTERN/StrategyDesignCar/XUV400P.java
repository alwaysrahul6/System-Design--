package DESIGN_PATTERN.STRATEGY_DESIGN_PATTERN.StrategyDesignCar;

public class XUV400P extends Car implements PetrolEngine {

    public EngineStrategy engineStrategy;

    public XUV400P(EngineStrategy Strategy) {
       this.engineStrategy = Strategy;
    }

    public void getInfo(){
        this.engineStrategy.getFuel();
    }

    @Override
    public String getPetrol() {
        return "Petrol Engine";
    }
}
