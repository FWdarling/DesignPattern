package strategy;

import entity.EatingStrategy;

/**
 * 兔类进食策略类
 * 继承自EatingStrategy
 */
public class RabbitEating implements EatingStrategy {

    /**
     * 兔类进食策略
     */
    @Override
    public void eatingAlgorithm() {
        System.out.println("吃了一筐萝卜");
    }
}
