package strategy;


import entity.Animal;

/**
 * 鸟类
 * 抽象类Animal的实例化
 * 通过override实现了具体策略
 */
public class Bird extends Animal {
    public Bird(String name, String training) {
        super(name, training);
    }

    @Override
    public void setEatingStrategy() {
        this.eatingStrategy = new BirdEating();
    }

    @Override
    public void setTrainingStrategy() {
        this.trainingStrategy = new BirdTraining();
    }

    @Override
    public void setPerformingStrategy() {
        this.performingStrategy = new BirdPerforming();
    }
}
