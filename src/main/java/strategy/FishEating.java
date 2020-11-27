package strategy;

import entity.EatingStrategy;

/**
 * 鱼类进食策略类
 * 实现了EatingStrategy
 */
public class FishEating implements EatingStrategy {
    /**
     * 鱼类进食策略
     */
    @Override
    public void eatingAlgorithm() {
        System.out.println("吃了一盘水草");
    }
}
