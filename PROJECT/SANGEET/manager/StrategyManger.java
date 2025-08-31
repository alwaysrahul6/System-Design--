package DESIGN_PATTERN.SANGEET.manager;

import DESIGN_PATTERN.SANGEET.enums.PlayStratgeyType;
import DESIGN_PATTERN.SANGEET.strategies.CustomStrategy;
import DESIGN_PATTERN.SANGEET.strategies.PlayStrategy;
import DESIGN_PATTERN.SANGEET.strategies.RandomStrategy;
import DESIGN_PATTERN.SANGEET.strategies.SequentialStrategy;

public class StrategyManger {
    private static StrategyManger instance;

    private final SequentialStrategy sequentialStrategy;

    private final RandomStrategy randomStrategy;

    private final CustomStrategy customStrategy;

    public StrategyManger(){
        this.sequentialStrategy = new SequentialStrategy();
        this.randomStrategy = new RandomStrategy();
        this.customStrategy = new CustomStrategy();
    }

    public static synchronized StrategyManger getInstance(){
        if (instance == null){
            instance = new StrategyManger();
        }
        return instance;
    }

    public PlayStrategy gettype(PlayStratgeyType type){
        if (type == PlayStratgeyType.CUSTOM){
            return customStrategy;
        } else if (type == PlayStratgeyType.RANDOM) {
            return randomStrategy;
        }else {
            return sequentialStrategy;
        }
    }
}
