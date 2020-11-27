package strategy;

import entity.PerformingStrategy;

/**
 * 鱼类表演策略类
 * 实现了PerformingStrategy
 */
public class FishPerforming implements PerformingStrategy {
    /**
     * 鱼类表演策略
     */
    @Override
    public void performingAlgorithm() {
        System.out.println("吐泡泡！");
    }
}
