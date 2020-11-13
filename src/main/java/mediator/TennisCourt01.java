public class TennisCourt01 extends AbstractTennisCourt{
    private Mediator mediator;

    private int startTime;
    public TennisCourt01(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void changeStartTime(int startTime) {
        this.startTime = startTime;
        System.out.println("======================");
        System.out.println("1号网球场开始使用时间为：" + this.startTime);
        System.out.println("======================");
        mediator.doNotify("Court01", startTime);
    }

    @Override
    public void borrow(int courtNum) {
        System.out.println("==========================");
        System.out.println("1号网球场正在借用" + courtNum + "号球场的设备");
        System.out.println("==========================");
        mediator.doNotify("Borrowing:1", courtNum);
    }
    @Override
    public void lend(int countNum) {
        System.out.println("==========================");
        System.out.println("1号球场正在将设备借给" + String.valueOf(countNum) + "号球场");
        System.out.println("==========================");
    }
}
