package strategy;


import entity.Animal;

/**
 * 鱼类
 * 抽象类Animal的实例化
 * 通过override实现了具体策略
 */
public class Fish extends Animal {
    public Fish(String name, String training) {
        super(name, training);
    }

    @Override
    public void setEatingStrategy() {
        this.eatingStrategy = new FishEating();
    }

    @Override
    public void setTrainingStrategy() {
        this.trainingStrategy = new FishTraining();
    }

    @Override
    public void setPerformingStrategy() {
        this.performingStrategy = new FishPerforming();
    }
}
