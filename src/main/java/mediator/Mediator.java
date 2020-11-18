package mediator;

public abstract class Mediator {
    protected TennisCourt tennisCourt;
    protected FootballCourt footballCourt;
    protected BasketballCourt basketballCourt;

    public abstract void doNotify(String info, String content);
}
