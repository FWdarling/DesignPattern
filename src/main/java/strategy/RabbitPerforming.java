package strategy;

import entity.PerformingStrategy;

public class RabbitPerforming implements PerformingStrategy {

    /**
     * 兔类表演策略
     */
    @Override
    public void performingAlgorithm() {
        System.out.println("跳圈！");
    }
}
