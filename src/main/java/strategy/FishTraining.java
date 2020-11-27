package strategy;

import entity.TrainingStrategy;

/**
 * 鱼类训练类
 * 实现了TrainingStrategy
 */
public class FishTraining implements TrainingStrategy {
    /**
     * 鱼类训练策略
     */
    @Override
    public void trainingAlgorithm() {
        System.out.println("——咕嘟咕嘟训练了一会——");
    }
}