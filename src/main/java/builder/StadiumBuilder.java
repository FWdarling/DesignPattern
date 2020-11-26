package builder;

import entity.Stadium;

/**
 * 场馆建造类，所有场馆建造类的抽象父类
 */
public abstract class StadiumBuilder {

    //    场馆类实例
    protected Stadium stadium;

    /**
     * 获取场馆类
     */
    public void getStadium() {
        stadium.showStadium();
    }

    /**
     * 场馆类实例化
     */
    public void buildNewStadium() {
        stadium = new Stadium();
    }

    /**
     * 建设观众席抽象方法
     */
    public abstract void buildSpectatorArea();

    /**
     * 重载建设观众席方法，传入自定义建造数量
     *
     * @param count int自定义观众席建造数量，大于零
     */
    public abstract void buildSpectatorArea(int count);

    /**
     * 建造竞赛区抽象方法
     */
    public abstract void buildCompetitionArea();

    /**
     * 重载建设竞赛区方法，传入自定义建造数量
     *
     * @param count int自定义比赛区建造数量，不小于2
     */
    public abstract void buildCompetitionArea(int count);

    /**
     * 设置场馆类型抽象方法
     */
    public abstract void setStadiumType();
}
