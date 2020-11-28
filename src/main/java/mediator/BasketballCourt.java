package mediator;

public class BasketballCourt extends AbstractCourt {
    private Mediator mediator;
    private String startTime;
    public BasketballCourt(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 设置场地开始使用时间
     */
    @Override
    public void changeStartTime(String startTime) {
        this.startTime = startTime;
        System.out.println("======================");
        System.out.println("BasketBallCourt开始使用时间为：" + this.startTime);
        System.out.println("======================");
        mediator.doNotify("BasketBallCourt", startTime);
    }

    /**
     * 借用设备
     * @param court 需要借用设备的球场
     */
    @Override
    public void borrow(String court) {
        System.out.println("==========================");
        System.out.println("BasketBallCourt正在借用" + court + "的设备");
        System.out.println("==========================");
        mediator.doNotify("BBasketBallCourt", court);
    }

    /**
     * 借用球场
     * @param court
     */
    @Override
    public void lend(String court) {
        System.out.println("==========================");
        System.out.println("BasketBallCourt正在将设备借给" + court);
        System.out.println("==========================");
    }
}
