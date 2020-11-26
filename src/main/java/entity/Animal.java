package entity;

/**
 * description: 动物类，父类，用于储存信息：名字、预报名项目
 * data: 11/13/20 01:30 AM
 * author: cjsmt
 */
public class Animal {
//    动物名称
private String name;
    private Event eventToSignUp;
    //    训练方式
    private String training = "默认训练";

    //    进食行为的策略
    protected EatingStrategy eatingStrategy;
    //    锻炼行为的策略
    protected TrainingStrategy trainingStrategy;

    //    开幕式表演策略
    protected PerformingStrategy performingStrategy;

    /**
     * 构造函数
     *
     * @param name 动物名
     */
    public Animal(String name) {
        this.name = name;

    }

    /**
     * 构造函数
     *
     * @param name     String 动物名字
     * @param training String 训练方式
     */
    public Animal(String name, String training) {
        this.name = name;
        this.setEatingStrategy();
        this.training = training;
        this.setTrainingStrategy();
        this.setPerformingStrategy();
    }

    /**
     * 获取名称
     *
     * @return 动物名
     */
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
    public void setEatingStrategy() {
    }

    /**
     * 设置训练行为具体策略
     */
    public void setTrainingStrategy() {
    }

    /**
     * 设置表演行为具体策略
     */
    public void setPerformingStrategy() {
    }

    /**
     * 进食行为
     */
    public void eat() {
        System.out.println(this.name + "正在进餐：");
        this.eatingStrategy.eatingAlgorithm();
        System.out.println("——————————————————");
    }

    /**
     * 训练行为
     */
    public void train() {
        System.out.println(this.name + "正在进行" + this.training + "训练：");
        this.trainingStrategy.trainingAlgorithm();
        System.out.println("——————————————————");
    }

    /**
     * 开幕式表演
     */
    public void perform() {
        System.out.println("开幕式入场中...");
        System.out.println(this.name + "表演了：");
        this.performingStrategy.performingAlgorithm();
        System.out.println("表演结束，退场...");
        System.out.println("——————————————————");
    }

}
