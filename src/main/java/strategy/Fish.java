package strategy;


import entity.Animal;

/**
 * 鱼类
 * 抽象类Animal的实例化
 * 通过override实现了具体策略
 */
public class Fish extends Animal {
    /**
     * 构造函数
     *
     * @param name     动物姓名
     * @param training 训练方法
     */
    public Fish(String name, String training) {
        super(name, training);
    }

    /**
     * 鱼类进食具体策略设置
     */
    @Override
    public void setEatingStrategy() {
        this.eatingStrategy = new FishEating();
    }

    /**
     * 鱼类训练具体策略设置
     */
    @Override
    public void setTrainingStrategy() {
        this.trainingStrategy = new FishTraining();
    }

    /**
     * 鱼类表演具体策略设置
     */
    @Override
    public void setPerformingStrategy() {
        this.performingStrategy = new FishPerforming();
    }
}
