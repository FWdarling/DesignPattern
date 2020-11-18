package nullobject.entity;

/**
 * 实际运动员类
 * 构造时获取姓名
 */
public class Athlete extends AbstractAthlete{
    public Athlete(String name){
        this.name=name;
    }
}
