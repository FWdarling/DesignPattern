package Strategy.entity;

import Strategy.EatingStrategy;
import Strategy.TrainingStrategy;

/**
 * 抽象动物类
 */
public abstract class Animal {
    //    进食行为的策略
    EatingStrategy eatingStrategy;
    //    锻炼行为的策略
    TrainingStrategy trainingStrategy;

    /**
     * 设置进食行为具体策略
     */
    public abstract void setEatingStrategy();

    /**
     * 设置训练行为具体策略
     */
    public abstract void setTrainingStrategy();

    /**
     * 进食行为
     */
    public void eat() {
        this.eatingStrategy.eatingAlgorithm();
    }

    /**
     * 训练行为
     */
    public void train() {
        this.trainingStrategy.trainingAlgorithm();
    }

    /**
     * 初始化时调用set
     */
    public Animal() {
        this.setEatingStrategy();
        this.setTrainingStrategy();
    }
}
