public abstract class Mediator {
    protected TennisCourt01 tennisCourt01;
    protected TennisCourt02 tennisCourt02;
    protected TennisCourt03 tennisCourt03;

    public abstract void doNotify(String info, int content);
}
