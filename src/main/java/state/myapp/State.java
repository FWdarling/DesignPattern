package state.myapp;

import state.PingpongAthlete;

/**
 * 抽象状态类
 * 不可实例化，继承它的具体状态才可被实例化
 */
public abstract class State {
    public PingpongAthlete thisAthlete;
    protected String stateName;
    protected int score;

    /**
     * 检查状态，并进行切换
     * 抽象方法，由子类实现具体切换逻辑
     */
    public abstract void checkState();

    /**
     * 打印状态
     */
    public void showState(){
        System.out.println("State: Now is " + stateName);
    }

    /**
     * 设置为失败
     * 用于对方达到 11 分后的认输
     */
    public void setLost(){
        thisAthlete.setState(new LostState(this));
    }

    /**
     * 加分
     * 获胜一球，加一分
     */
    public void addScore(){
        this.score++;
    }

    /**
     * 获取当前分数
     * @return score
     */
    public int getScore() {
        return score;
    }

    /**
     * 获取当前状态名
     * @return stateName
     */
    public String getStateName() {
        return stateName;
    }
}
