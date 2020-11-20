package strategy;

import entity.TrainingStrategy;

/**
 * 鱼类训练类
 * 继承自TrainingStrategy接口
 * 实例化鱼类训练方法
 */
public class FishTraning implements TrainingStrategy {
    @Override
    public void trainingAlgorithm() {
        System.out.println("This fish is training for swimming competition!");
    }
}