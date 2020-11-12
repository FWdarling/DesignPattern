package strategy.entity;

import strategy.RabbitEating;
import strategy.RabbitTraining;

/**
 * 兔类
 * 抽象类Animal的实例化
 * 通过override实现了具体策略
 */
public class Rabbit extends Animal{
    @Override
    public void setEatingStrategy() {
        this.eatingStrategy = new RabbitEating();
    }

    @Override
    public void setTrainingStrategy() {
        this.trainingStrategy = new RabbitTraining();
    }
}
