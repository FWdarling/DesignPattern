package strategy;

import entity.EatingStrategy;

/**
 * 鱼类进食策略类
 * 继承自EatingStrategy
 */
public class FishEating implements EatingStrategy {
    @Override
    public void eatingAlgorithm() {
        System.out.println("吃了一盘水草");
    }
}
