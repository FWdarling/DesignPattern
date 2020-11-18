package state.myapp;

/**
 * 失败状态类
 * 用于描述运动员处于失败状态
 */
public class LostState extends State {
    /**
     * 构造函数
     * 拷贝原状态的部分信息，并将状态名设置为 Lost
     * @param lastState
     */
    public LostState(State lastState){
        this.stateName = "Lost";
        this.score = lastState.getScore();
        this.thisAthlete = lastState.thisAthlete;
    }

    /**
     * 检查状态
     * 实现抽象函数，空实现，意味着不再切换状态
     */
    @Override
    public void checkState() {

    }
}
