package strategy;

import entity.PerformingStrategy;

public class FishPerforming implements PerformingStrategy {
    @Override
    public void performingAlgorithm() {
        System.out.println("吐泡泡！");
    }
}
