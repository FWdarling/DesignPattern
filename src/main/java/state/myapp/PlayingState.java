package state.myapp;

import state.PingpongAthlete;

/**
 * 正在比赛状态类
 * 用于描述运动员正在比赛
 */
public class PlayingState extends State {
    /**
     * 构造函数，在前面没有状态的情况下，创建初始状态，需要传入运动员指针
     * 拷贝原状态的部分信息，并将状态名设置为 playing
     * @param thisAthlete
     */
    public PlayingState(PingpongAthlete thisAthlete){
        this.thisAthlete=thisAthlete;
        this.score=0;
        this.stateName="Playing";
    }

    /**
     * 构造函数，在前面已有状态的情况下，切换到该状态
     * 拷贝原状态的部分信息，并将状态名设置为 playing
     * @param lastState
     */
    public PlayingState(State lastState){
        this.thisAthlete = lastState.thisAthlete;
        this.score = lastState.getScore();
        this.stateName = "Playing";
    }

    /**
     * 检查状态
     * 如果分数达到 10 分，则切换到赛点状态
     */
    @Override
    public void checkState() {
        if(this.score==10){
            this.thisAthlete.setState(new MatchPointState(this));
        }
    }
}
