package mediator;

public class TennisCourt extends AbstractCourt {
    private Mediator mediator;

    private String startTime;
    public TennisCourt(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     *
     * @param startTime 球场开始使用的时间
     */
    @Override
    public void changeStartTime(String startTime) {
        this.startTime = startTime;
        System.out.println("======================");
        System.out.println("TennisCourt开始使用时间为：" + this.startTime);
        System.out.println("======================");
        mediator.doNotify("TennisCourt", startTime);
    }

    /**
     *
     * @param court 需要借用设备的球场
     */
    @Override
    public void borrow(String court) {
        System.out.println("==========================");
        System.out.println("TennisCourt正在借用" + court + "的设备");
        System.out.println("==========================");
        mediator.doNotify("BTennisCourt", court);
    }

    /**
     *
     * @param court
     */
    @Override
    public void lend(String court) {
        System.out.println("==========================");
        System.out.println("TennisCourt正在将设备借给" + court);
        System.out.println("==========================");
    }
}
