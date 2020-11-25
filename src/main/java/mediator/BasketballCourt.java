package mediator;

public class BasketballCourt extends AbstractCourt {
    private Mediator mediator;
    private String startTime;
    public BasketballCourt(Mediator mediator) {
        this.mediator = mediator;
    }
    @Override
    public void changeStartTime(String startTime) {
        this.startTime = startTime;
        System.out.println("======================");
        System.out.println("BasketBallCourt开始使用时间为：" + this.startTime);
        System.out.println("======================");
        mediator.doNotify("BasketBallCourt", startTime);
    }

    @Override
    public void borrow(String court) {
        System.out.println("==========================");
        System.out.println("BasketBallCourt正在借用" + court + "的设备");
        System.out.println("==========================");
        mediator.doNotify("BBasketBallCourt", court);
    }
    @Override
    public void lend(String court) {
        System.out.println("==========================");
        System.out.println("BasketBallCourt正在将设备借给" + court);
        System.out.println("==========================");
    }
}
