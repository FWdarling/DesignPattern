package state;

import state.myapp.PlayingState;
import state.myapp.State;

/**
 * 乒乓运动员类
 * 持有一个状态 state
 * 可以切换状态
 * 可以添加分数
 * 可以打印状态
 * 可以认输
 */
public class PingpongAthlete {
    private State state = new PlayingState(this);

    /**
     * 设置状态
     * 用于将运动员状态设置为新状态
     * @param state
     */
    public void setState(State state){
        this.state = state;
    }

    /**
     * 加分
     * 增加运动员的分数，并检查状态是否需要切换，如果需要则切换
     */
    public void addScore(){
        this.state.addScore();
        this.state.checkState();
    }

    /**
     * 打印状态
     */
    public void showState(){
        System.out.println("Now is " + state.getScore() + ", " + state.getStateName());
    }

    /**
     * 人数，将状态设为失败
     */
    public void lost(){
        this.state.setLost();
    }
}
