package strategy;

import entity.PerformingStrategy;

public class BirdPerforming implements PerformingStrategy {

    @Override
    public void performingAlgorithm() {
        System.out.println("特技飞行！");
    }
}
