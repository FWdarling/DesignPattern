package mediator;

public class MediatorTest {
    public void mediatorTest() {
        DispatchMediator dispatchMediator = new DispatchMediator();
        TennisCourt01 tennisCourt01 = new TennisCourt01(dispatchMediator);
        TennisCourt02 tennisCourt02 = new TennisCourt02(dispatchMediator);
        TennisCourt03 tennisCourt03 = new TennisCourt03(dispatchMediator);

        dispatchMediator.setTennisCourt01(tennisCourt01);
        dispatchMediator.setTennisCourt02(tennisCourt02);
        dispatchMediator.setTennisCourt03(tennisCourt03);

        tennisCourt01.changeStartTime(2);
        tennisCourt01.borrow(2);
        tennisCourt02.borrow(3);
    }
}
