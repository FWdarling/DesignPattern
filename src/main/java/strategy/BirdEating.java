package strategy;

import entity.EatingStrategy;

/**
 * 鸟类进食策略类
 * 继承自EatingStrategy
 */
public class BirdEating implements EatingStrategy {
    @Override
    public void eatingAlgorithm() {
        System.out.println("吃了一顿鸟食");
    }
}
