package strategy;

import entity.TrainingStrategy;

/**
 * 兔类训练类
 * 继承自TrainingStrategy接口
 * 实例化兔类训练方法
 */
public class RabbitTraining implements TrainingStrategy {

    /**
     * 兔类训练策略
     */
    @Override
    public void trainingAlgorithm() {
        System.out.println("——蹦蹦跳跳训练了一会——");
    }
}
