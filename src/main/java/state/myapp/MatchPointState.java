package state.myapp;

/**
 * 赛点状态类
 * 用于描述运动员正处于赛点
 */
public class MatchPointState extends State {
    /**
     * 构造函数
     * 拷贝原状态的部分信息，并将状态名设置为 MatchPoint
     * @param lastState
     */
    public MatchPointState(State lastState){
        this.thisAthlete = lastState.thisAthlete;
        this.score = lastState.getScore();
        this.stateName = "MatchPoint";
    }

    /**
     * 检查状态
     * 实现抽象方法，如果达到 11 分则切换到胜利状态
     */
    @Override
    public void checkState() {
        if(this.score==11){
            thisAthlete.setState(new WinState(this));
        }

    }
}
