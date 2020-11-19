package entity;

/**
 * description: 动物类，父类，用于储存信息：名字、预报名项目
 * data: 11/13/20 01:30 AM
 * author: cjsmt
 */
public class Animal {
    private String name;
    private Event eventToSignUp;

    //    进食行为的策略
    protected EatingStrategy eatingStrategy;
    //    锻炼行为的策略
    protected TrainingStrategy trainingStrategy;

    public Animal(String name) {
        this.name = name;
    }

    /**
     * 初始化时调用set
     */
    public Animal() {
        this.setEatingStrategy();
        this.setTrainingStrategy();
    }

    public String getName() {
        return name;
    }

    public Event getEventToSignUp() {
        return eventToSignUp;
    }

    public void setEventToSignUp(Event eventToSignUp) {
        this.eventToSignUp = eventToSignUp;
    }

    /**
     * 设置进食行为具体策略
     */
    public void setEatingStrategy() {};

    /**
     * 设置训练行为具体策略
     */
    public void setTrainingStrategy() {};

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

}
