package strategy;

import entity.TrainingStrategy;

/**
 * 鸟类训练类
 * 实现了TrainingStrategy
 */
public class BirdTraining implements TrainingStrategy {
    /**
     * 鸟类训练策略
     */
    @Override
    public void trainingAlgorithm() {
        System.out.println("——叽叽喳喳训练了一会——");
    }
}
