package observer.entity;

/**
 * description: 运动员抽象类
 * date: 11/11/20 1:03 AM
 * author: fourwood
 */
public abstract class Athlete {
    protected final String name;

    public Athlete(String _name){
        name = _name;
    }

    public String getName() {
        return name;
    }

    /**
     * description: 听到裁判宣布比赛开始，运动员作出的行动
     *              观察者模式中使用
     * date: 11/11/20 1:23 AM
     * author: fourwood
     *
     * @param
     * @return void
     */
    abstract public void start();

}
