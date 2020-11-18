package state.myapp;

import state.myapp.State;

/**
 * 胜利状态类
 * 用于描述运动员处于胜利状态
 */
public class WinState extends State {
    /**
     * 构造函数
     * 拷贝原状态的部分信息，并将状态名改为 Win
     * @param lastState
     */
    public WinState(State lastState){
        this.thisAthlete = lastState.thisAthlete;
        this.score = lastState.getScore();
        this.stateName = "Win";
    }

    /**
     * 检查状态
     * 当分数不等于 11 的时候，变回 11 ，因为加分的时候未检查状态
     */
    @Override
    public void checkState() {
        if(score!=11){
            this.score=11;
        }
    }
}
