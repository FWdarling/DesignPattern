package strategy;

import entity.TrainingStrategy;

/**
 * 鱼类训练类
 * 继承自TrainingStrategy接口
 * 实例化鱼类训练方法
 */
public class FishTraining implements TrainingStrategy {
    @Override
    public void trainingAlgorithm() {
        System.out.println("——咕嘟咕嘟训练了一会——");
    }
}