package strategy;

import entity.Animal;

/**
 * 兔类
 * 抽象类Animal的实例化
 * 通过override实现了具体策略
 */
public class Rabbit extends Animal {
    /**
     * 构造函数
     *
     * @param name     动物姓名
     * @param training 训练方法
     */
    public Rabbit(String name, String training) {
        super(name, training);
    }

    /**
     * 兔类进食具体策略设置
     */
    @Override
    public void setEatingStrategy() {
        this.eatingStrategy = new RabbitEating();
    }

    /**
     * 兔类训练具体策略设置
     */
    @Override
    public void setTrainingStrategy() {
        this.trainingStrategy = new RabbitTraining();
    }

    /**
     * 兔类表演具体策略设置
     */
    @Override
    public void setPerformingStrategy() {
        this.performingStrategy = new RabbitPerforming();
    }
}
