/**
 *
 */
public abstract class AbstractTennisCourt {
    /**
     *
     * @param startTime 球场开始使用的时间
     */
    public abstract void changeStartTime(int startTime);

    /**
     *
     * @param courtNum 需要借用设备的球场
     */
    public abstract void borrow(int courtNum);

    /**
     * 出借设备的球场
     * @param countNum
     */
    public abstract void lend(int countNum);
}