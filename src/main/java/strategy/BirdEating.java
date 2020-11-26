package strategy;

import entity.EatingStrategy;

/**
 * 鸟类进食策略类
 * 实现了EatingStrategy
 */
public class BirdEating implements EatingStrategy {
    /**
     * 鸟类进食策略
     */
    @Override
    public void eatingAlgorithm() {
        System.out.println("吃了一顿鸟食");
    }
}
