package DESIGN_PATTERN.STRATEGY_DESIGN_PATTERN.StrategyDesignCar;

public class XUV700P extends Car implements PetrolEngine{

    public EngineStrategy engineStrategy;

    public XUV700P(EngineStrategy strategy){
        this.engineStrategy = strategy;
    }

    public void getInfo(){
        this.engineStrategy.getFuel();
    }

    @Override
    public String getPetrol() {
        return "Petrol Engine";
    }
}
