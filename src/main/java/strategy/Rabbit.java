package strategy;

import entity.Animal;

/**
 * 兔类
 * 抽象类Animal的实例化
 * 通过override实现了具体策略
 */
public class Rabbit extends Animal {
    public Rabbit(String name, String training) {
        super(name, training);
    }

    @Override
    public void setEatingStrategy() {
        this.eatingStrategy = new RabbitEating();
    }

    @Override
    public void setTrainingStrategy() {
        this.trainingStrategy = new RabbitTraining();
    }

    @Override
    public void setPerformingStrategy() {
        this.performingStrategy = new RabbitPerforming();
    }
}
