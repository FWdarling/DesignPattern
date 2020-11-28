package mediator;

public abstract class Mediator {
    protected TennisCourt tennisCourt;
    protected FootballCourt footballCourt;
    protected BasketballCourt basketballCourt;

    /**
     * 通知中介者信息
     * @param info
     * @param content
     */
    public abstract void doNotify(String info, String content);
}
