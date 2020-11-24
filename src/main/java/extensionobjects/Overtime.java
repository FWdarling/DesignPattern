package extensionobjects;

/**
 * 所有扩展类的抽象基类
 */
public abstract class Overtime {
    protected Race race;

    /**
     * 指定主体，构造扩展对象
     * @param race
     */
    public Overtime(Race race) {
        this.race = race;
    }

    /**
     * 扩展自身的操作：添加加时赛
     * @param overtime
     */
    public abstract void SetOvertime(int overtime);
}
