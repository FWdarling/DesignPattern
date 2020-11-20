package strategy;

import entity.PerformingStrategy;

public class RabbitPerforming implements PerformingStrategy {
    @Override
    public void performingAlgorithm() {
        System.out.println("跳圈！");
    }
}
