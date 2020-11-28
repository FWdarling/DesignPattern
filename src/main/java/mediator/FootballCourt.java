package mediator;

public class FootballCourt extends AbstractCourt {
    private Mediator mediator;
    private String startTime;
    public FootballCourt(Mediator mediator) {
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
        System.out.println("FootballCourt开始使用时间为：" + this.startTime);
        System.out.println("======================");
        mediator.doNotify("CFootballCourt", startTime);
    }

    /**
     *
     * @param court 需要借用设备的球场
     */
    @Override
    public void borrow(String court) {
        System.out.println("==========================");
        System.out.println("FootballCourt正在借用" + court + "的设备");
        System.out.println("==========================");
        mediator.doNotify("BFootballCourt", court);
    }

    /**
     *
     * @param court
     */
    @Override
    public void lend(String court) {
        System.out.println("==========================");
        System.out.println("FootballCourt正在将设备借给" + court);
        System.out.println("==========================");
    }
}
