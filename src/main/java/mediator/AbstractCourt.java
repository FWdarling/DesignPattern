package mediator;

/**
 *
 */
public abstract class AbstractCourt {
    /**
     *
     * @param startTime 球场开始使用的时间
     */
    public abstract void changeStartTime(String startTime);

    /**
     *
     * @param court 需要借用设备的球场
     */
    public abstract void borrow(String court);

    /**
     * 出借设备的球场
     * @param court
     */
    public abstract void lend(String court);
}