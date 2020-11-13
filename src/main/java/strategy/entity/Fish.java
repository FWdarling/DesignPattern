package strategy.entity;

import strategy.FishEating;
import strategy.FishTraning;

/**
 * 鱼类
 * 抽象类Animal的实例化
 * 通过override实现了具体策略
 */
public class Fish extends Animal{
    @Override
    public void setEatingStrategy() {
        this.eatingStrategy = new FishEating();
    }

    @Override
    public void setTrainingStrategy() {
        this.trainingStrategy = new FishTraning();
    }
}
