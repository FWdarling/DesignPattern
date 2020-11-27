package strategy;

import entity.PerformingStrategy;

/**
 * 鸟类表演策略类
 * 实现了PerformingStrategy
 */
public class BirdPerforming implements PerformingStrategy {

    /**
     * 鸟类表演策略
     */
    @Override
    public void performingAlgorithm() {
        System.out.println("特技飞行！");
    }
}
